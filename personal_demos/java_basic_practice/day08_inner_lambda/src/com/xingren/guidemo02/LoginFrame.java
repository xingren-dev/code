package com.xingren.guidemo02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {

    public LoginFrame() {
        //1.设置窗口的标题
        this.setTitle("登录窗口");
        //2.设置窗口的大小
        this.setSize(400, 300);
        //3.设置窗口居中
        this.setLocationRelativeTo(null);
        //4.设置窗口关闭操作
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        init();


    }

    private void init() {
        JButton loginButton = new JButton("登录");
        loginButton.addActionListener(this);

        JPanel panel = new JPanel();
        this.add(panel);

        panel.add(loginButton);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "点击了登录按钮");
    }
}
