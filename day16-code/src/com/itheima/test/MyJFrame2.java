package com.itheima.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
//鼠标动作可以分解为四个动作
// 1.移入按钮(事件源)
// 2.移出事件源
// 3.点击事件源但不松开
// 4.松开
// 其中3和4 组合成单击,和ActionListener单击类似

// 对应的MouseListener就有五个方法的重写.
// 事件是能够被组件识别的行为
// 当你对组件进行某些操作的时候,即事件发生,执行代码.
// 一个完整的事件由事件源,事件本身,事件监听绑定组成.
// button就是一个事件源,点击就是一个事件,你要把监听绑定要事件源上,如果监听到了事件,那么就执行对应的代码.
public class MyJFrame2 extends JFrame implements MouseListener {
    //创建按钮组件对象
    Random r = new Random();
    JButton jButton = new JButton("按钮1");

    public MyJFrame2() {
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
        jButton.setBounds(0, 0, 100, 50);

        //把鼠标事件的监听添加到按钮中(按照需求设计的)(把鼠标监听绑定到事件源jButton上)
        //只要调用这个方法,就需要传递MouseListener这个接口的实现类的对象.在此之前需要对这个接口进行实现.
        //然后我在本类中就实现了这个接口
        //这个接口全部内容只有五个抽象方法,所有操作都能识别,但至于执行什么内容就是我设计的内容了
        jButton.addMouseListener(this);

        //把子组件jButton添加到MyJFrame中.这样界面才会显示出这个按钮
        getContentPane().add(jButton);

        setVisible(true);


    }
//貌似点击不区分左键和右键
    @Override
    public void mouseClicked(MouseEvent e) {
        //监听单击
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //按下但是不松开
        System.out.println("按下");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //松开按键
        System.out.println("松开");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("移入");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("移出");

    }
}
