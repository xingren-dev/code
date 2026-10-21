package com.xingren.guidemo01;

import javax.swing.*;

public class JFrameDemo01 {
    public static void main(String[] args) {

        JFrame jf=new JFrame("登录窗口");//创建窗口

        JPanel jp=new JPanel();//创建面板
        jf.add(jp);//将面板添加到窗口

        jf.setSize(400,300);//设置窗口大小

        jf.setLocationRelativeTo(null);//窗口居中

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭窗口的默认操作并退出程序

        JButton jb = new JButton("登录");//创建按钮
        jb.setBounds(100,100,100,50);//设置按钮位置和大小
        jp.add(jb);//将按钮添加到面板
        jf.setVisible(true);//设置窗口可见



    }
}
