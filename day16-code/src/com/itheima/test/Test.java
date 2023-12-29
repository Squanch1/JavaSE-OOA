package com.itheima.test;
//以后写关于测试的代码全部写在test包下,可以直接写main方法测试,方便快捷,互不干扰.

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(603, 680);
        //设置框架的名称
        jFrame.setTitle("拼图游戏单机版 V我50");

        //设置框架永远居中
        jFrame.setLocationRelativeTo(null);

        //设置当前页面永远在最上层
        jFrame.setAlwaysOnTop(true);

        //修改默认关闭选项操作,关闭一个页面直接关闭虚拟机
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //必须手动取消默认布局默认居中布局
        jFrame.setLayout(null);


        JButton jButton = new JButton("点一下");
        //必须要设置按钮的大小,不然估计默认按钮大小为0,看不见的
        jButton.setBounds(0, 0, 100, 100);


        //addActionListener的参数是ActionListener,是一个接口,所以参数类型需要是一个接口的实现类
        //又因为一般情况下每个按钮都是不同的业务逻辑,所以每个按钮一般只实现一次,这时候就可以用匿名内部类了
        //匿名内部类的添加方式
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("装备不花一分钱");
            }
        });

        jFrame.getContentPane().add(jButton);

        //让界面显示出来
        jFrame.setVisible(true);
    }

}
