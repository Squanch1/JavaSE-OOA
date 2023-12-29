package com.itheima.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class MyJFrame3 extends JFrame implements KeyListener {
    //创建按钮组件对象
    public MyJFrame3() {
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


        //设置按钮组件的大小和位置(事件源)
        // 把键盘监听添加到整个MyJFrame中
        super.addKeyListener(this);


        //jButton.addMouseListener(this);

        //把子组件jButton添加到MyJFrame中.这样界面才会显示出这个按钮

        setVisible(true);


    }

    /**
     * 这个兼容不好,不用了
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //按住不松开,和鼠标监听的区别就是鼠标按住不松开只会识别一次,而键盘按住不松则会一直识别
        //System.out.println("按住不松");
    }

    /**
     * 用keyReleased方法
     */
    @Override
    public void keyReleased(KeyEvent e) {
        //getKeyCode方法:
        //获取键盘上按键对应的编号,编号和ASCII码表没啥关系
        //可以用于区分键盘上的按键

        int keyCode = e.getKeyCode();
        System.out.println(keyCode);
        //松开按键
        //System.out.println("松开按键");
    }
}
