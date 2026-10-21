package com.xingren.guidemo01;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

/**
 * AI生成的
 * 现代化 Swing 登录界面。
 *
 * <p>全部由 Java2D 手绘（渐变、圆角、阴影、图标、动画），无第三方依赖。
 * 演示账号：admin / 123456。接入真实后端时替换 {@link FormPanel#doLogin()} 中的校验逻辑即可。</p>
 *
 * 编译：javac -encoding UTF-8 LoginFrame.java
 * 运行：java LoginFrame
 */
public class LoginFrame extends JFrame {

    private static final int WINDOW_W = 960;
    private static final int WINDOW_H = 640;
    private static final int CARD_RADIUS = 28;
    private static final int BRAND_WIDTH = 360;

    private final boolean translucent;
    private Point dragStart;

    public static void main(String[] args) {
        System.setProperty("awt.useSystemAAFontSettings", "on");
        System.setProperty("swing.aatext", "true");
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {
                // 自定义组件不依赖外观，失败也不影响界面
            }
            new LoginFrame().setVisible(true);
        });
    }

    public LoginFrame() {
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Nebula Studio - 登录");
        setSize(WINDOW_W, WINDOW_H);
        setLocationRelativeTo(null);

        GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        translucent = device.isWindowTranslucencySupported(GraphicsDevice.WindowTranslucency.PERPIXEL_TRANSLUCENT);
        if (translucent) {
            setBackground(new Color(0, 0, 0, 0));
        } else {
            // 极少数不支持逐像素透明的环境：退回浅灰底
            setBackground(new Color(0xEEF2F7));
        }

        BrandPanel brand = new BrandPanel();
        FormPanel form = new FormPanel();
        RootPanel root = new RootPanel(brand, form);
        setContentPane(root);

        installWindowDrag(root);
        installWindowDrag(brand);
        installWindowDrag(form);
        form.installDragTargets(this::installWindowDrag);

        getRootPane().registerKeyboardAction(e -> dispose(),
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                form.focusUsername();
                if (!translucent) {
                    return;
                }
                try {
                    setOpacity(0f);
                    Timer fade = new Timer(16, null);
                    fade.addActionListener(ev -> {
                        float next = Math.min(1f, getOpacity() + 0.09f);
                        setOpacity(next);
                        if (next >= 1f) {
                            fade.stop();
                        }
                    });
                    fade.start();
                } catch (UnsupportedOperationException ex) {
                    try {
                        setOpacity(1f);
                    } catch (UnsupportedOperationException ignored) {
                        // 忽略：直接以不透明方式显示
                    }
                }
            }
        });
    }

    /** 允许按住任意非交互区域拖动整个无边框窗口。 */
    private void installWindowDrag(Component component) {
        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                dragStart = e.getPoint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                if (dragStart == null) {
                    return;
                }
                Point p = e.getLocationOnScreen();
                setLocation(p.x - dragStart.x, p.y - dragStart.y);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                dragStart = null;
            }
        };
        component.addMouseListener(adapter);
        component.addMouseMotionListener(adapter);
    }

    // ------------------------------------------------------------------
    // 调色板 & 字体
    // ------------------------------------------------------------------

    static final class Palette {
        static final Color INK = new Color(0x0F172A);
        static final Color TEXT = new Color(0x1F2937);
        static final Color LABEL = new Color(0x374151);
        static final Color MUTED = new Color(0x6B7280);
        static final Color SUBTLE = new Color(0x94A3B8);
        static final Color FIELD_BG = new Color(0xF8FAFC);
        static final Color FIELD_BG_HOVER = new Color(0xF4F7FB);
        static final Color FIELD_BORDER = new Color(0xE2E8F0);
        static final Color FIELD_BORDER_HOVER = new Color(0xCBD5E1);
        static final Color PRIMARY = new Color(0x6366F1);
        static final Color PRIMARY_DARK = new Color(0x4F46E5);
        static final Color VIOLET = new Color(0x8B5CF6);
        static final Color SUCCESS = new Color(0x059669);
        static final Color ERROR = new Color(0xDC2626);
    }

    static final class Typography {
        static final String FAMILY;

        static {
            Set<String> available = new HashSet<>(Arrays.asList(
                    GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames()));
            String chosen = null;
            for (String candidate : new String[]{
                    "Microsoft YaHei UI", "Microsoft YaHei", "PingFang SC",
                    "Noto Sans CJK SC", "Source Han Sans SC", "Segoe UI"}) {
                if (available.contains(candidate)) {
                    chosen = candidate;
                    break;
                }
            }
            FAMILY = chosen == null ? Font.SANS_SERIF : chosen;
        }

        static Font regular(float size) {
            return new Font(FAMILY, Font.PLAIN, 1).deriveFont(size);
        }

        static Font bold(float size) {
            return new Font(FAMILY, Font.BOLD, 1).deriveFont(Font.BOLD, size);
        }
    }

    private static Color mix(Color a, Color b, float t) {
        t = Math.max(0f, Math.min(1f, t));
        return new Color(
                Math.round(a.getRed() + (b.getRed() - a.getRed()) * t),
                Math.round(a.getGreen() + (b.getGreen() - a.getGreen()) * t),
                Math.round(a.getBlue() + (b.getBlue() - a.getBlue()) * t));
    }

    private static void quality(Graphics2D g2) {
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
    }

    // ------------------------------------------------------------------
    // 根面板：透明窗口 + 卡片阴影
    // ------------------------------------------------------------------

    private static final class RootPanel extends JPanel {
        private static final int PAD_X = 26;
        private static final int PAD_TOP = 16;
        private static final int PAD_BOTTOM = 36;

        private final BrandPanel brand;
        private final FormPanel form;

        RootPanel(BrandPanel brand, FormPanel form) {
            this.brand = brand;
            this.form = form;
            setOpaque(false);
            setLayout(null);
            add(brand);
            add(form);
        }

        private Rectangle cardBounds() {
            return new Rectangle(PAD_X, PAD_TOP,
                    Math.max(0, getWidth() - PAD_X * 2),
                    Math.max(0, getHeight() - PAD_TOP - PAD_BOTTOM));
        }

        @Override
        public void doLayout() {
            Rectangle card = cardBounds();
            brand.setBounds(card.x, card.y, BRAND_WIDTH, card.height);
            form.setBounds(card.x + BRAND_WIDTH, card.y, card.width - BRAND_WIDTH, card.height);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            quality(g2);
            Rectangle card = cardBounds();
            if (card.width <= 0 || card.height <= 0) {
                g2.dispose();
                return;
            }

            // 多层低透明度圆角矩形叠加，模拟柔和投影
            for (int i = 18; i >= 1; i--) {
                g2.setColor(new Color(24, 28, 55, 3));
                g2.fillRoundRect(card.x - i, card.y - i + 5,
                        card.width + i * 2, card.height + i * 2,
                        CARD_RADIUS + i * 2, CARD_RADIUS + i * 2);
            }

            g2.setColor(Color.WHITE);
            g2.fillRoundRect(card.x, card.y, card.width, card.height, CARD_RADIUS, CARD_RADIUS);

            g2.setColor(new Color(15, 23, 42, 18));
            g2.setStroke(new BasicStroke(1f));
            g2.drawRoundRect(card.x, card.y, card.width - 1, card.height - 1, CARD_RADIUS, CARD_RADIUS);
            g2.dispose();
        }
    }

    // ------------------------------------------------------------------
    // 左侧品牌区
    // ------------------------------------------------------------------

    private static final class BrandPanel extends JPanel {
        private final long startNanos = System.nanoTime();

        BrandPanel() {
            setOpaque(false);
            // 装饰光斑缓慢漂移，让左侧渐变区有一点呼吸感
            new Timer(50, e -> repaint()).start();
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            quality(g2);
            int w = getWidth();
            int h = getHeight();
            if (w <= 0 || h <= 0) {
                g2.dispose();
                return;
            }

            Path2D shape = leftRoundedRect(w, h, CARD_RADIUS);
            g2.clip(shape);

            g2.setPaint(new GradientPaint(0, 0, new Color(0x4338CA), w, h, new Color(0x7C3AED)));
            g2.fillRect(0, 0, w, h);

            float t = (System.nanoTime() - startNanos) / 1_000_000_000f;
            float x1 = w * 0.80f + (float) Math.sin(t * 0.35) * 18f;
            float y1 = h * 0.10f + (float) Math.cos(t * 0.30) * 14f;
            float x2 = w * 0.05f + (float) Math.cos(t * 0.25) * 20f;
            float y2 = h * 0.88f + (float) Math.sin(t * 0.40) * 14f;

            softGlow(g2, x1, y1, 210, 30);
            softGlow(g2, x2, y2, 190, 22);

            // 细线圆环
            g2.setColor(new Color(255, 255, 255, 30));
            g2.setStroke(new BasicStroke(1.1f));
            g2.drawOval((int) (w * 0.52 + Math.sin(t * 0.20) * 10), (int) (h * 0.58), 250, 250);
            g2.setColor(new Color(255, 255, 255, 18));
            g2.drawOval((int) (w * 0.62), (int) (h * 0.70), 250, 250);

            paintLogo(g2);
            paintCopy(g2, h);
            g2.dispose();
        }

        private void paintLogo(Graphics2D g2) {
            int x = 48;
            int y = 52;
            int size = 52;
            g2.setColor(new Color(255, 255, 255, 36));
            g2.fillRoundRect(x, y, size, size, 16, 16);
            g2.setColor(new Color(255, 255, 255, 92));
            g2.setStroke(new BasicStroke(1f));
            g2.drawRoundRect(x, y, size, size, 16, 16);

            double cx = x + size / 2.0;
            double cy = y + size / 2.0;
            double outer = 15;
            double inner = 4.4;
            Path2D spark = new Path2D.Double();
            spark.moveTo(cx, cy - outer);
            spark.quadTo(cx + inner, cy - inner, cx + outer, cy);
            spark.quadTo(cx + inner, cy + inner, cx, cy + outer);
            spark.quadTo(cx - inner, cy + inner, cx - outer, cy);
            spark.quadTo(cx - inner, cy - inner, cx, cy - outer);
            spark.closePath();
            g2.setColor(Color.WHITE);
            g2.fill(spark);
        }

        private void paintCopy(Graphics2D g2, int h) {
            g2.setFont(Typography.bold(11.5f));
            g2.setColor(new Color(255, 255, 255, 165));
            g2.drawString("N E B U L A   S T U D I O", 49, 152);

            g2.setFont(Typography.bold(34f));
            g2.setColor(Color.WHITE);
            g2.drawString("欢迎回来", 48, 210);

            g2.setFont(Typography.regular(13.5f));
            g2.setColor(new Color(255, 255, 255, 200));
            g2.drawString("登录您的专属工作空间，", 48, 246);
            g2.drawString("继续打造更出色的产品体验。", 48, 268);

            String[] features = {"端到端安全加密", "跨设备实时同步", "7×24 小时技术支持"};
            for (int i = 0; i < features.length; i++) {
                int cy = 336 + i * 42;
                int checkX = 48;
                int checkY = cy - 10;
                g2.setColor(new Color(255, 255, 255, 26));
                g2.fillOval(checkX, checkY, 20, 20);
                g2.setColor(new Color(255, 255, 255, 78));
                g2.setStroke(new BasicStroke(1f));
                g2.drawOval(checkX, checkY, 20, 20);

                Path2D check = new Path2D.Double();
                check.moveTo(checkX + 5.2, checkY + 10.2);
                check.lineTo(checkX + 8.8, checkY + 13.8);
                check.lineTo(checkX + 15.2, checkY + 6.4);
                g2.setColor(new Color(255, 255, 255, 235));
                g2.setStroke(new BasicStroke(1.8f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                g2.draw(check);

                g2.setFont(Typography.regular(13f));
                g2.setColor(new Color(255, 255, 255, 210));
                g2.drawString(features[i], 80, cy + 4);
            }

            g2.setFont(Typography.regular(11.5f));
            g2.setColor(new Color(255, 255, 255, 132));
            g2.drawString("© 2026 Nebula Studio  ·  v2.4.0", 48, h - 32);
        }

        private static void softGlow(Graphics2D g2, float cx, float cy, float radius, int alpha) {
            RadialGradientPaint paint = new RadialGradientPaint(
                    new Point2D.Float(cx, cy), radius,
                    new float[]{0f, 1f},
                    new Color[]{new Color(255, 255, 255, alpha), new Color(255, 255, 255, 0)});
            g2.setPaint(paint);
            g2.fill(new Ellipse2D.Float(cx - radius, cy - radius, radius * 2, radius * 2));
        }

        private static Path2D leftRoundedRect(int w, int h, int r) {
            float rr = Math.min(r, Math.min(w, h) / 2f);
            Path2D p = new Path2D.Float();
            p.moveTo(rr, 0);
            p.lineTo(w, 0);
            p.lineTo(w, h);
            p.lineTo(rr, h);
            p.quadTo(0, h, 0, h - rr);
            p.lineTo(0, rr);
            p.quadTo(0, 0, rr, 0);
            p.closePath();
            return p;
        }
    }

    // ------------------------------------------------------------------
    // 右侧表单区
    // ------------------------------------------------------------------

    private final class FormPanel extends JPanel {
        private final TextInput username;
        private final TextInput password;
        private final JLabel status;
        private final GradientButton loginButton;
        private final List<Component> dragTargets = new ArrayList<>();

        FormPanel() {
            setOpaque(false);
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            setBorder(BorderFactory.createEmptyBorder(18, 46, 28, 46));

            // 顶部窗口按钮（置顶右侧）
            JPanel header = new JPanel();
            header.setOpaque(false);
            header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
            WindowControl minimize = new WindowControl(WindowControl.MINIMIZE);
            minimize.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    setState(Frame.ICONIFIED);
                }
            });
            WindowControl close = new WindowControl(WindowControl.CLOSE);
            close.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    dispose();
                }
            });
            header.add(Box.createHorizontalGlue());
            header.add(minimize);
            header.add(Box.createHorizontalStrut(2));
            header.add(close);
            header.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
            header.setAlignmentX(Component.LEFT_ALIGNMENT);
            add(header);

            add(Box.createVerticalGlue());

            JLabel title = text("登录账户", Typography.bold(27f), Palette.INK);
            add(title);
            add(Box.createVerticalStrut(8));
            JLabel subtitle = text("请输入账号信息以继续", Typography.regular(13f), Palette.MUTED);
            add(subtitle);
            add(Box.createVerticalStrut(30));

            JLabel userLabel = text("账号", Typography.bold(12.5f), Palette.LABEL);
            add(userLabel);
            add(Box.createVerticalStrut(7));
            username = new TextInput(false, "请输入账号 / 邮箱");
            add(username);

            add(Box.createVerticalStrut(16));

            JLabel passwordLabel = text("密码", Typography.bold(12.5f), Palette.LABEL);
            add(passwordLabel);
            add(Box.createVerticalStrut(7));
            password = new TextInput(true, "请输入密码");
            add(password);

            add(Box.createVerticalStrut(4));

            status = new JLabel(" ");
            status.setFont(Typography.regular(12.5f));
            status.setForeground(Palette.SUBTLE);
            status.setAlignmentX(Component.LEFT_ALIGNMENT);
            status.setPreferredSize(new Dimension(10, 20));
            status.setMaximumSize(new Dimension(Integer.MAX_VALUE, 20));
            add(status);

            add(Box.createVerticalStrut(6));

            JPanel options = new JPanel();
            options.setOpaque(false);
            options.setLayout(new BoxLayout(options, BoxLayout.X_AXIS));
            CheckBox remember = new CheckBox("记住我");
            LinkLabel forgot = new LinkLabel("忘记密码？");
            options.add(remember);
            options.add(Box.createHorizontalGlue());
            options.add(forgot);
            options.setMaximumSize(new Dimension(Integer.MAX_VALUE, 26));
            options.setAlignmentX(Component.LEFT_ALIGNMENT);
            add(options);

            add(Box.createVerticalStrut(18));

            loginButton = new GradientButton("登 录");
            loginButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 48));
            loginButton.setPreferredSize(new Dimension(10, 48));
            loginButton.setAlignmentX(Component.LEFT_ALIGNMENT);
            loginButton.addActionListener(e -> doLogin());
            add(loginButton);

            add(Box.createVerticalStrut(18));

            JPanel register = new JPanel();
            register.setOpaque(false);
            register.setLayout(new BoxLayout(register, BoxLayout.X_AXIS));
            register.add(Box.createHorizontalGlue());
            register.add(text("还没有账号？", Typography.regular(13f), Palette.MUTED));
            register.add(Box.createHorizontalStrut(6));
            register.add(new LinkLabel("立即注册"));
            register.add(Box.createHorizontalGlue());
            register.setMaximumSize(new Dimension(Integer.MAX_VALUE, 22));
            register.setAlignmentX(Component.LEFT_ALIGNMENT);
            add(register);

            add(Box.createVerticalGlue());

            username.onSubmit(this::doLogin);
            password.onSubmit(this::doLogin);
            showStatus("演示账号：admin / 123456", Palette.SUBTLE);

            dragTargets.add(this);
            dragTargets.add(title);
            dragTargets.add(subtitle);
            dragTargets.add(userLabel);
            dragTargets.add(passwordLabel);
        }

        private JLabel text(String value, Font font, Color color) {
            JLabel label = new JLabel(value);
            label.setFont(font);
            label.setForeground(color);
            label.setAlignmentX(Component.LEFT_ALIGNMENT);
            return label;
        }

        void focusUsername() {
            username.focus();
        }

        void installDragTargets(Consumer<Component> installer) {
            for (Component target : dragTargets) {
                installer.accept(target);
            }
        }

        private void showStatus(String message, Color color) {
            status.setText(message);
            status.setForeground(color);
        }

        private void doLogin() {
            if (loginButton.isLoading()) {
                return;
            }
            String user = username.getText().trim();
            String pass = password.getText();

            if (user.isEmpty()) {
                showStatus("请输入账号", Palette.ERROR);
                username.focus();
                return;
            }
            if (pass.isEmpty()) {
                showStatus("请输入密码", Palette.ERROR);
                password.focus();
                return;
            }

            showStatus(" ", Palette.SUBTLE);
            loginButton.setLoading(true);

            // 模拟网络请求；接入后端时在这里调用认证接口
            Timer timer = new Timer(850, e -> {
                loginButton.setLoading(false);
                if ("admin".equals(user) && "123456".equals(pass)) {
                    showStatus("登录成功，正在进入系统…", Palette.SUCCESS);
                    // TODO: 在这里打开主界面，例如 new MainFrame().setVisible(true); dispose();
                } else {
                    showStatus("账号或密码错误（演示账号：admin / 123456）", Palette.ERROR);
                }
            });
            timer.setRepeats(false);
            timer.start();
        }
    }

    // ------------------------------------------------------------------
    // 圆角输入框（含图标、占位文本、聚焦光晕、密码显隐）
    // ------------------------------------------------------------------

    private static final class TextInput extends JPanel {
        private final JTextField field;
        private final boolean password;
        private final String placeholder;
        private boolean hovered;
        private boolean focused;
        private boolean reveal;
        private boolean eyeHovered;

        TextInput(boolean password, String placeholder) {
            this.password = password;
            this.placeholder = placeholder;
            setOpaque(false);
            setLayout(null);
            setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            setPreferredSize(new Dimension(10, 48));
            setMaximumSize(new Dimension(Integer.MAX_VALUE, 48));
            setMinimumSize(new Dimension(10, 48));

            if (password) {
                JPasswordField pf = new JPasswordField();
                pf.setEchoChar('•');
                field = pf;
            } else {
                field = new JTextField();
            }
            field.setOpaque(false);
            field.setBorder(BorderFactory.createEmptyBorder());
            field.setFont(Typography.regular(14f));
            field.setForeground(Palette.TEXT);
            field.setCaretColor(Palette.PRIMARY_DARK);
            field.setSelectionColor(new Color(99, 102, 241, 70));
            field.setSelectedTextColor(Palette.INK);
            add(field);

            field.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    repaint();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    repaint();
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    repaint();
                }
            });
            field.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    focused = true;
                    repaint();
                }

                @Override
                public void focusLost(FocusEvent e) {
                    focused = false;
                    repaint();
                }
            });

            MouseAdapter hoverHandler = new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    hovered = true;
                    repaint();
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    hovered = false;
                    eyeHovered = false;
                    repaint();
                }
            };
            addMouseListener(hoverHandler);
            field.addMouseListener(hoverHandler);

            addMouseMotionListener(new MouseAdapter() {
                @Override
                public void mouseMoved(MouseEvent e) {
                    boolean overEye = password && e.getX() >= getWidth() - 44;
                    if (overEye != eyeHovered) {
                        eyeHovered = overEye;
                        repaint();
                    }
                }
            });

            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    if (password && e.getX() >= getWidth() - 44) {
                        toggleReveal();
                    } else {
                        field.requestFocusInWindow();
                    }
                }
            });
        }

        @Override
        public void doLayout() {
            int right = password ? 44 : 18;
            field.setBounds(46, 10, Math.max(10, getWidth() - 46 - right), 28);
        }

        String getText() {
            return password ? new String(((JPasswordField) field).getPassword()) : field.getText();
        }

        void focus() {
            field.requestFocusInWindow();
        }

        void onSubmit(Runnable action) {
            field.addActionListener(e -> action.run());
        }

        private void toggleReveal() {
            reveal = !reveal;
            ((JPasswordField) field).setEchoChar(reveal ? (char) 0 : '•');
            field.requestFocusInWindow();
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            quality(g2);
            int w = getWidth();
            int h = getHeight();
            int r = 12;

            Color background = focused ? Color.WHITE : (hovered ? Palette.FIELD_BG_HOVER : Palette.FIELD_BG);
            g2.setColor(background);
            g2.fillRoundRect(0, 0, w - 1, h - 1, r, r);

            if (focused) {
                g2.setColor(new Color(99, 102, 241, 24));
                g2.setStroke(new BasicStroke(3.5f));
                g2.drawRoundRect(2, 2, w - 5, h - 5, r, r);
            }

            g2.setColor(focused ? Palette.PRIMARY
                    : (hovered ? Palette.FIELD_BORDER_HOVER : Palette.FIELD_BORDER));
            g2.setStroke(new BasicStroke(focused ? 1.5f : 1f));
            g2.drawRoundRect(1, 1, w - 2, h - 2, r, r);

            int iconX = 24;
            int iconY = h / 2;
            g2.setColor(focused ? Palette.PRIMARY : Palette.SUBTLE);
            if (password) {
                paintLockIcon(g2, iconX, iconY);
            } else {
                paintUserIcon(g2, iconX, iconY);
            }

            if (field.getText().isEmpty()) {
                g2.setFont(Typography.regular(14f));
                g2.setColor(Palette.SUBTLE);
                FontMetrics fm = g2.getFontMetrics();
                int baseline = (h - fm.getHeight()) / 2 + fm.getAscent();
                g2.drawString(placeholder, 46, baseline);
            }

            if (password) {
                paintEye(g2, w - 26, h / 2);
            }
            g2.dispose();
        }

        private void paintUserIcon(Graphics2D g2, int cx, int cy) {
            g2.setStroke(new BasicStroke(1.5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g2.draw(new Ellipse2D.Float(cx - 4f, cy - 9f, 8f, 8f));
            g2.draw(new Arc2D.Float(cx - 8f, cy + 0.5f, 16f, 13f, 0, 180, Arc2D.OPEN));
        }

        private void paintLockIcon(Graphics2D g2, int cx, int cy) {
            g2.setStroke(new BasicStroke(1.5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g2.draw(new Arc2D.Float(cx - 5f, cy - 8.5f, 10f, 12f, 0, 180, Arc2D.OPEN));
            g2.draw(new Line2D.Float(cx - 5f, cy - 2.5f, cx - 5f, cy - 1.5f));
            g2.draw(new Line2D.Float(cx + 5f, cy - 2.5f, cx + 5f, cy - 1.5f));
            g2.draw(new RoundRectangle2D.Float(cx - 7f, cy - 1.5f, 14f, 11f, 3.5f, 3.5f));
            g2.fill(new Ellipse2D.Float(cx - 1f, cy + 3f, 2f, 2f));
        }

        private void paintEye(Graphics2D g2, int cx, int cy) {
            if (eyeHovered) {
                g2.setColor(new Color(99, 102, 241, 22));
                g2.fillOval(cx - 13, cy - 13, 26, 26);
            }
            g2.setColor(eyeHovered ? Palette.PRIMARY : Palette.SUBTLE);
            g2.setStroke(new BasicStroke(1.5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            Path2D eye = new Path2D.Double();
            eye.moveTo(cx - 9, cy);
            eye.curveTo(cx - 4.5, cy - 6.5, cx + 4.5, cy - 6.5, cx + 9, cy);
            eye.curveTo(cx + 4.5, cy + 6.5, cx - 4.5, cy + 6.5, cx - 9, cy);
            g2.draw(eye);
            g2.fill(new Ellipse2D.Float(cx - 2.4f, cy - 2.4f, 4.8f, 4.8f));
            if (!reveal) {
                g2.draw(new Line2D.Float(cx - 9f, cy + 7.5f, cx + 9f, cy - 7.5f));
            }
        }
    }

    // ------------------------------------------------------------------
    // 自定义复选框
    // ------------------------------------------------------------------

    private static final class CheckBox extends JComponent {
        private final String text;
        private boolean selected;
        private boolean hovered;

        CheckBox(String text) {
            this.text = text;
            setFont(Typography.regular(13f));
            setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            setFocusable(true);
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    toggle();
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    hovered = true;
                    repaint();
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    hovered = false;
                    repaint();
                }
            });
            addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    repaint();
                }

                @Override
                public void focusLost(FocusEvent e) {
                    repaint();
                }
            });
            getInputMap(WHEN_FOCUSED).put(KeyStroke.getKeyStroke("SPACE"), "toggle");
            getActionMap().put("toggle", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    toggle();
                }
            });
        }

        private void toggle() {
            selected = !selected;
            repaint();
        }

        boolean isSelected() {
            return selected;
        }

        @Override
        public Dimension getPreferredSize() {
            FontMetrics fm = getFontMetrics(getFont());
            return new Dimension(18 + 9 + fm.stringWidth(text), 24);
        }

        @Override
        public Dimension getMaximumSize() {
            return getPreferredSize();
        }

        @Override
        public Dimension getMinimumSize() {
            return getPreferredSize();
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            quality(g2);
            int boxSize = 18;
            int boxY = (getHeight() - boxSize) / 2;

            if (selected) {
                g2.setPaint(new GradientPaint(0, boxY, Palette.PRIMARY, boxSize, boxY + boxSize, Palette.VIOLET));
                g2.fillRoundRect(0, boxY, boxSize, boxSize, 5, 5);
                g2.setColor(Color.WHITE);
                g2.setStroke(new BasicStroke(1.9f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                Path2D check = new Path2D.Double();
                check.moveTo(4.2, boxY + 9.2);
                check.lineTo(7.6, boxY + 12.6);
                check.lineTo(13.8, boxY + 5.6);
                g2.draw(check);
            } else {
                g2.setColor(hovered ? Color.WHITE : Palette.FIELD_BG);
                g2.fillRoundRect(0, boxY, boxSize, boxSize, 5, 5);
                g2.setColor(hovered ? Palette.PRIMARY : Palette.FIELD_BORDER_HOVER);
                g2.setStroke(new BasicStroke(1.2f));
                g2.drawRoundRect(0, boxY, boxSize - 1, boxSize - 1, 5, 5);
            }

            if (isFocusOwner()) {
                g2.setColor(new Color(99, 102, 241, 70));
                g2.setStroke(new BasicStroke(1.2f));
                g2.drawRoundRect(-3, boxY - 3, boxSize + 6, boxSize + 6, 8, 8);
            }

            g2.setFont(getFont());
            g2.setColor(new Color(0x475569));
            FontMetrics fm = g2.getFontMetrics();
            int baseline = (getHeight() + fm.getAscent() - fm.getDescent()) / 2;
            g2.drawString(text, 27, baseline);
            g2.dispose();
        }
    }

    // ------------------------------------------------------------------
    // 文字链接
    // ------------------------------------------------------------------

    private static final class LinkLabel extends JLabel {
        private boolean hovered;

        LinkLabel(String text) {
            super(text);
            setFont(Typography.regular(13f));
            setForeground(Palette.PRIMARY);
            setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    hovered = true;
                    setForeground(Palette.PRIMARY_DARK);
                    repaint();
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    hovered = false;
                    setForeground(Palette.PRIMARY);
                    repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (!hovered) {
                return;
            }
            Graphics2D g2 = (Graphics2D) g.create();
            quality(g2);
            g2.setColor(getForeground());
            g2.setStroke(new BasicStroke(1f));
            int width = g2.getFontMetrics(getFont()).stringWidth(getText());
            g2.drawLine(0, getHeight() - 2, width, getHeight() - 2);
            g2.dispose();
        }
    }

    // ------------------------------------------------------------------
    // 窗口最小化 / 关闭按钮
    // ------------------------------------------------------------------

    private static final class WindowControl extends JComponent {
        static final int MINIMIZE = 0;
        static final int CLOSE = 1;

        private final int type;
        private boolean hovered;

        WindowControl(int type) {
            this.type = type;
            setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    hovered = true;
                    repaint();
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    hovered = false;
                    repaint();
                }
            });
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(30, 30);
        }

        @Override
        public Dimension getMaximumSize() {
            return getPreferredSize();
        }

        @Override
        public Dimension getMinimumSize() {
            return getPreferredSize();
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            quality(g2);
            int w = getWidth();
            int h = getHeight();
            int cx = w / 2;
            int cy = h / 2;

            if (hovered) {
                g2.setColor(type == CLOSE ? new Color(239, 68, 68, 30) : new Color(15, 23, 42, 16));
                g2.fillRoundRect(0, 0, w, h, 9, 9);
            }

            g2.setColor(hovered ? (type == CLOSE ? new Color(0xDC2626) : new Color(0x475569))
                    : new Color(0x94A3B8));
            g2.setStroke(new BasicStroke(1.5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            if (type == CLOSE) {
                g2.drawLine(cx - 4, cy - 4, cx + 4, cy + 4);
                g2.drawLine(cx + 4, cy - 4, cx - 4, cy + 4);
            } else {
                g2.drawLine(cx - 5, cy, cx + 5, cy);
            }
            g2.dispose();
        }
    }

    // ------------------------------------------------------------------
    // 渐变主按钮（悬停渐变动画 + 登录中加载态）
    // ------------------------------------------------------------------

    private static final class GradientButton extends JButton {
        private static final int FILL_HEIGHT_OFFSET = 2;

        private float hoverProgress;
        private boolean hovered;
        private boolean loading;
        private float spin;
        private Timer animator;

        GradientButton(String text) {
            super(text);
            setOpaque(false);
            setContentAreaFilled(false);
            setBorderPainted(false);
            setFocusPainted(false);
            setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            setFont(Typography.bold(15f));
            setForeground(Color.WHITE);

            animator = new Timer(16, e -> {
                boolean dirty = false;
                float target = hovered ? 1f : 0f;
                if (Math.abs(hoverProgress - target) > 0.005f) {
                    hoverProgress += (target - hoverProgress) * 0.22f;
                    if (Math.abs(hoverProgress - target) < 0.005f) {
                        hoverProgress = target;
                    }
                    dirty = true;
                }
                if (loading) {
                    spin = (spin + 9f) % 360f;
                    dirty = true;
                }
                if (dirty) {
                    repaint();
                }
                if (!loading && hoverProgress == target) {
                    animator.stop();
                }
            });
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    hovered = true;
                    animator.start();
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    hovered = false;
                    animator.start();
                }
            });
        }

        void setLoading(boolean loading) {
            this.loading = loading;
            setEnabled(!loading);
            setCursor(Cursor.getPredefinedCursor(loading ? Cursor.WAIT_CURSOR : Cursor.HAND_CURSOR));
            if (loading) {
                animator.start();
            } else {
                spin = 0;
                repaint();
            }
        }

        boolean isLoading() {
            return loading;
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            quality(g2);
            int w = getWidth();
            int h = getHeight();
            int fillH = Math.max(1, h - FILL_HEIGHT_OFFSET);
            int radius = 12;
            boolean pressed = getModel().isPressed() && isEnabled();

            if (!pressed) {
                g2.setColor(new Color(79, 70, 229, 45));
                g2.fillRoundRect(1, 4, w - 2, Math.max(1, fillH - 2), 14, 14);
            }

            Color c1 = mix(Palette.PRIMARY, Color.WHITE, hoverProgress * 0.10f);
            Color c2 = mix(Palette.VIOLET, Color.WHITE, hoverProgress * 0.10f);
            if (pressed) {
                c1 = c1.darker();
                c2 = c2.darker();
            }
            g2.setPaint(new GradientPaint(0, 0, c1, w, fillH, c2));
            g2.fillRoundRect(0, 0, w, fillH, radius, radius);

            // 顶部轻微高光，增加立体感
            g2.setColor(new Color(255, 255, 255, 30));
            g2.drawLine(radius, 1, w - radius, 1);

            if (loading) {
                int cx = w / 2;
                int cy = fillH / 2;
                int r = 9;
                g2.setStroke(new BasicStroke(2.2f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                g2.setColor(new Color(255, 255, 255, 70));
                g2.draw(new Ellipse2D.Float(cx - r, cy - r, r * 2f, r * 2f));
                g2.setColor(Color.WHITE);
                g2.draw(new Arc2D.Float(cx - r, cy - r, r * 2f, r * 2f, -spin, 270f, Arc2D.OPEN));
            } else {
                String label = getText();
                g2.setFont(getFont());
                g2.setColor(Color.WHITE);
                FontMetrics fm = g2.getFontMetrics();
                int tx = (w - fm.stringWidth(label)) / 2;
                int ty = (fillH + fm.getAscent() - fm.getDescent()) / 2;
                g2.drawString(label, tx, ty);
            }
            g2.dispose();
        }
    }
}
