package com.itheima.ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

//鼠标点击用getSource,键盘用getKeyCode
public class LoginJFrame extends JFrame implements MouseListener {
    //创建一个集合存储正确的用户名和密码
    static ArrayList<User> list = new ArrayList<>();

    //静态代码块用于个集合初始化,随着类加载而调用,自动执行,只会执行一次
    static {
        list.add(new User("zhangsan", 21, "zhangsan", "123456"));
    }

    JTextField username = new JTextField();
    JTextField password = new JTextField();
    JTextField code = new JTextField();
    String codeStr = null;
    JLabel rightCode = new JLabel();


    JButton login = new JButton();
    JButton register = new JButton();


    public LoginJFrame() {
        //初始化界面
        initJFrame();

        //在这个界面中添加内容
        initView();

        //


        //让当前界面显示出来
        this.setVisible(true);
    }

    public void initView() {
        //1. 添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon("day16-code\\image\\login\\用户名.png"));
        usernameText.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameText);

        //2.添加用户名输入框
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //3.添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("day16-code\\image\\login\\密码.png"));
        passwordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordText);

        //4.密码输入框
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //验证码图片提示
        JLabel codeText = new JLabel(new ImageIcon("day16-code\\image\\login\\验证码.png"));
        codeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(codeText);

        //验证码的输入框
        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);

        codeStr = CodeUtil.getCode();


        //设置内容
        rightCode.setText(codeStr);
        rightCode.addMouseListener(this);
        //位置和宽高
        rightCode.setBounds(300, 256, 50, 30);
        //添加到界面
        this.getContentPane().add(rightCode);

        //5.添加登录按钮
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("day16-code\\image\\login\\登录按钮.png"));
        //去除按钮的默认边框
        login.setBorderPainted(false);
        //去除按钮的默认背景
        login.setContentAreaFilled(false);


        //给登录按钮绑定监听
        login.addMouseListener(this);
        //给注册按钮绑定监听
        register.addMouseListener(this);


        this.getContentPane().add(login);

        //6.添加注册按钮
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("day16-code\\image\\login\\注册按钮.png"));
        //去除按钮的默认边框
        register.setBorderPainted(false);
        //去除按钮的默认背景
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);

        //7.添加背景图片
        JLabel background = new JLabel(new ImageIcon("day16-code\\image\\login\\background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);
    }


    public void initJFrame() {
        this.setSize(488, 430);//设置宽高
        this.setTitle("拼图游戏 V1.0登录");//设置标题
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置关闭模式
        this.setLocationRelativeTo(null);//居中
        this.setAlwaysOnTop(true);//置顶
        this.setLayout(null);//取消内部默认布局
    }


    //要展示用户名或密码错误
    public void showJDialog(String content) {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //创建JLabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);
    }


    //因为鼠标监听只要程序没结束就不会停,所以自带一个死循环,不用在mouesClicked里面加循环了
    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if (source == login) {
            //细节如果文本框里没有输入文字,那么应该是空字符串而不是null,当然这个在getText底层帮我们实现好了,但是我们意识到这一点.
            String usernameText = username.getText();
            String passwordText = password.getText();
            String codeText = code.getText();

            if (codeText.isEmpty()) {
                showJDialog("验证码不能为空!");
                //刷新验证码,显示的验证码和存储的都要变
                codeStr = CodeUtil.getCode();
                rightCode.setText(codeStr);
                return;
            } else if (!codeText.equalsIgnoreCase(codeStr)) {
                showJDialog("验证码有误!");
                codeStr = CodeUtil.getCode();
                rightCode.setText(codeStr);
                return;
            }

            if (usernameText.isEmpty()) {
                showJDialog("用户名不能为空");
                codeStr = CodeUtil.getCode();
                rightCode.setText(codeStr);
                return;
            } else if (passwordText.isEmpty()) {
                showJDialog("密码不能为空");
                codeStr = CodeUtil.getCode();
                rightCode.setText(codeStr);
                return;
            } else if (usernameText.equals(list.get(0).getUsername()) && passwordText.equals(list.get(0).getPassword())) {
                showJDialog("登陆成功!");
                System.out.println("用户名和密码正确可以开始玩了");
                setVisible(false);
                new GameJFrame();
            } else {
                showJDialog("用户名或者密码有误");
                codeStr = CodeUtil.getCode();
                rightCode.setText(codeStr);
                return;
            }
        } else if (source == rightCode) {
            codeStr = CodeUtil.getCode();
            rightCode.setText(codeStr);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object source = e.getSource();
        if (source == login) {
            //切换登录按钮的背景图片,重新创建一个按钮就行,不用做多余操作(我以为跟图片更新一样,要重新设置很多东西.)
            login.setIcon(new ImageIcon("day16-code\\image\\login\\登录按下.png"));
        } else if (source == register) {
            register.setIcon(new ImageIcon("day16-code\\image\\login\\注册按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object source = e.getSource();
        if (source == login) {
            login.setIcon(new ImageIcon("day16-code\\image\\login\\登录按钮.png"));
        } else if (source == register) {
            register.setIcon(new ImageIcon("day16-code\\image\\login\\注册按钮.png"));
        }
        //与上面呼应,松开后显示正常的图片

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
