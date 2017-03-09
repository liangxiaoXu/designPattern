package com.pattern.service.adapter.interfaceAdapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by xuliangxiao on 2016/12/12
 * 接口的适配器模式
 * 接口定义了很多方法，但是有时候并不是所有的都需要实现
 *
 */
public class MainFrame extends JFrame{
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setTitle("我的标题");
        frame.setSize(500, 300);
        JPanel jPanel = new JPanel();

        Button button = new Button();
        button.setSize(40, 20);
        button.setLabel("i'm a button ,don't click me");

        //直接使用MouseListener接口，必须实现它所定义的所有的方法，缺一不可
        //而一般常用的方法也就那几个，这就造成了会有很多的空实现的代码！！
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "谁让你点我的！！！");
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        }
    );


        //使用适配器模式，可以根据需要自由的实现MouseListener所定义的方法
//        button.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                JOptionPane.showMessageDialog(null, "谁让你点我的！！！");
//                super.mouseClicked(e);
//            }

            /*@Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "mouseEntered");
                super.mouseEntered(e);
            }*/

//        });


        jPanel.add(button);
        frame.add(jPanel);
        frame.setVisible(true);
    }
}
