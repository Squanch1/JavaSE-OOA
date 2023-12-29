package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
//使用的是ActionListener的接口
//动作监听可以接受左键单击和空格
//ActionListener可以监听到左键单击和空格按钮

public class MyJFrame1 extends JFrame implements ActionListener {
    //创建按钮组件对象
    Random r = new Random();
    JButton jButton1 = new JButton("按钮1");
    JButton jButton2 = new JButton("按钮2");

    public MyJFrame1() {
        //设置框架大小
        setSize(603, 680);

        //设置框架的名称
        setTitle("拼图游戏单机版 V我50");

        //设置框架永远居中
        setLocationRelativeTo(null);

        //设置当前页面永远在最上层
        setAlwaysOnTop(true);

        //修改默认关闭选项操作,关闭一个页面直接关闭虚拟机
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //必须手动取消默认布局的默认居中布局,只有取消之后才能按照XY坐标参数添加组件
        setLayout(null);


        //设置按钮组件的大小和位置
        jButton1.setBounds(0, 0, 100, 50);
        jButton1.addActionListener(this);


        jButton2.setBounds(100, 0, 10, 10);
        jButton2.addActionListener(this);

        //利用jButton对象的addActionListener方法 给jButton按钮添加一个ActionListener事件,然后这个事件是一个接口,需要传递他的实现类.
        //具体方法里面传递的参数,我们用不到,所以不用去关心.

        //为什么给addActionListener方法传递ActionListener的实现类对象,然后就可以完成绑定,并执行.这是别人封装好的,目前不需要我们研究.只要知道这个用法就行.
        //只需要知道addActionListener方法的参数是ActionListener的实现类对象,和运行结果是执行实现类中重写方法里的代码就行,不用关心具体实现,这个实现和之前学习的接口多态没关系.

        getContentPane().add(jButton1);
        getContentPane().add(jButton2);


        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == jButton1) {
            jButton1.setSize(200, 200);
        } else if (source == jButton2) {
            jButton2.setLocation(r.nextInt(500)+200, r.nextInt(500)+200);
        }

    }
}
