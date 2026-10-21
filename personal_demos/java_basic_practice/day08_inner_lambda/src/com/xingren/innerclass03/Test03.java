package com.xingren.innerclass03;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 匿名内部类的使用场景
 *
 * 开发中不是我们要主动写匿名内部类，而是用别人的功能的时候，别人可以让我们写一个匿名内部类，我们才会写
 *
 */


public class Test03 {
    public static void main(String[] args) {

        /*
        创建一个登录窗口，窗口上只有一个登录按钮
         */

        JFrame win = new JFrame("登录窗口");
        win.setSize(300,200);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        win.add(btn);


        //Java中要求必须给这个按钮添加一个点击事件监听器对象
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("登录按钮被点击了");
            }

        });


        win.setVisible(true);





    }


}
