package com.xingren.guidemo01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDemo01 {
    public static void main(String[] args) {
        // 1. 创建窗口对象
        JFrame jf = new JFrame("我的窗口");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. 创建按钮
        JButton btn = new JButton("点我");

        // 3. 添加按钮点击监听器
        btn.addActionListener((ActionEvent e) -> {
            // 直接使用外部的jf对象修改标题，不要用e.getSource()转JFrame
            jf.setTitle("标题被改了_Lambda表达式");
        });

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setTitle("标题被改了_匿名内部类");
            }
        });



        MyListener myListener = new MyListener(jf);
        btn.addActionListener(myListener);



        // 4. 把按钮添加到窗口
        jf.add(btn);

        // 5. 显示窗口
        jf.setVisible(true);
    }
}

class MyListener implements ActionListener {
    private JFrame jf;

    public MyListener(JFrame jf) {
        this.jf = jf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jf.setTitle("标题被改了_实现类");
    }
}
