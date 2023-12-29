package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

//JDialog和JFrame平级
public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //可以让GameJFrame直接继承JFrame这个类,这样不用创建这个类的对象就能直接使用他的构造方法了
    //然后和以往所写的构造方法不同之处在于:没有对成员变量初始化,而是在构造方法里调用了父类方法,利用父类方法创建了一个框架
    //把创建框架的方法写进构造方法,这样在其他方法中只要创建这个类的对象(new GameJFrame();),就会由虚拟机调用构造方法,自动创建框架.
    //super/this写不写都行
    //setSize只是创建了一个框架,默认是不显示的.如果要显示还需要调用setVisible方法.
    //开始接触项目了,要学会把不止一个成员方法中用到的变量创建在成员位置,这样一来所有方法就都能调用了.
    //如果在方法里创建, 则需要在方法中添加额外的形参,还需要考虑方法的返回值,非常麻烦,而且可能会反复创建.
    //直接创建成员变量!
    //以前学的:就近原则,this,super访问规则
    Random r = new Random();

    //这个二位数组相当于是提示了
    JMenuItem replayGame = new JMenuItem("重新游戏");
    JMenuItem reLogin = new JMenuItem("重新登陆");
    JMenuItem closeGame = new JMenuItem("关闭游戏");
    JMenuItem officialAccounts = new JMenuItem("打赏");

    int[][] winArray = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    int[][] arr = new int[4][4];

    // 既然ImagineIcon的构造方法需要字符串,我们可以利用字符串可以拼接的特性
    // 创建字符串变量path用于提取反复出现的路径,方便后续更换图片操作.
    String path = "day16-code\\image\\animal\\animal2\\";
    int x = 0;
    int y = 0;
    int count = 0;

    /**
     * 切记代码是写在构造方法里的,这个方法只有在创建GameJFrame的对象才会执行,所以方法体要默认有一个GameJFrame对象
     */
    public GameJFrame() {
        //子类自动调用了super()(父类的空参构造);

        //初始化主界面大框架
        initJFrame();

        //初始化菜单并把菜单加入到主界面中
        initJMenuBar();

        //初始化数据
        initDate();

        //初始化图片
        initImage();

        //显示出设置好菜单的主界面(要关闭不是真的关闭,而是把它隐藏起来)setVisible(false)
        setVisible(true);
    }

    private void initDate() {
        int[] arr1 = new int[16];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }
        for (int i = 0; i < arr1.length; i++) {
            int randomIndex = r.nextInt(arr1.length);
            int temp = arr1[i];
            arr1[i] = arr1[randomIndex];
            arr1[randomIndex] = temp;
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr1[index];
                index++;
                if (arr[i][j] == 0) {
                    this.x = i;
                    this.y = j;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    private void initImage() {
        getContentPane().removeAll();

        JLabel stepCounter = new JLabel("步数:" + count);
        stepCounter.setBounds(50, 30, 100, 20);
        getContentPane().add(stepCounter);

        //因为每次移动都会调用initImage方法,所以可以把胜利的运行代码也放到方法里面去.
        if (checkVictory()) {
            JLabel win = new JLabel(new ImageIcon("day16-code\\image\\win.png"));
            win.setBounds(203, 283, 197, 73);
            getContentPane().add(win);
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number = arr[i][j];
                //把创建一个图片对象,其中一个构造方法是传递路径字符串,如果不存在,则不添加图片.
                //ImageIcon的特性,先添加的显示在上层,后添加的显示在下层
                ImageIcon imageIcon = new ImageIcon(path + number + ".jpg");
                //创建容器来接收图片对象
                JLabel jLabel = new JLabel(imageIcon);

                //把容器添加到JFrame实例中
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);

                //给每个小图片添加边框
                BevelBorder bevelBorder = new BevelBorder(BevelBorder.LOWERED);
                jLabel.setBorder(bevelBorder);

                //contentPane是内容面板,在创建JFrame对象时,JVM自动创建(JFrame的构造方法调用了父类的super())
                getContentPane().add(jLabel);
            }
        }
        //在Java中: 相对路径是默认在当前项目下的,所以项目及以上的路径可以直接省略.
        ImageIcon background = new ImageIcon("day16-code\\image\\background.png");
        JLabel bg = new JLabel(background);
        bg.setBounds(40, 40, 508, 560);
        getContentPane().add(bg);
        getContentPane().repaint();

    }

    private void initJFrame() {
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

        //必须手动取消默认布局默认居中布局,一劳永逸
        setLayout(null);

        //根据业务要求分析,键盘监听应该绑定在整个框架中,也就是GameJFrame中
        addKeyListener(this);

    }

    private void initJMenuBar() {
        //创建JMenuBar对象来存储JMenu对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建JMenu对象来存储JMenuItem对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutUsJMenu = new JMenu("关于我们");

        //创建JMenuItem对象


        //用上一级对象的方法来添加下一级的对象
        aboutUsJMenu.add(officialAccounts);
        replayGame.addActionListener(this);
        closeGame.addActionListener(this);
        reLogin.addActionListener(this);
        officialAccounts.addActionListener(this);

        functionJMenu.add(replayGame);
        functionJMenu.add(reLogin);
        functionJMenu.add(closeGame);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutUsJMenu);

        //最后把用调用从superclass JFrame里继承过来的方法,把JMenuBar添加到JFrame里去
        //虽然目前为止还未创建JFrame的对象,但是在App类的main方法中会创建对象,而且这些代码是在创建对象之后才会执行.
        //add(jMenuBar);
        //最后把JMenuBar添加到JFrame对象里面不能跟用add,要用setJMenuBar.
        super.setJMenuBar(jMenuBar);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //如果游戏胜利那么就用下面的代码中断监听,虽然监听没有停止,但是全为无效监听.
        if (checkVictory()) {
            return;
        }
        int keyCode = e.getKeyCode();
        if (keyCode == 65) {
            getContentPane().removeAll();

            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            getContentPane().add(all);

            ImageIcon background = new ImageIcon("day16-code\\image\\background.png");
            JLabel bg = new JLabel(background);
            bg.setBounds(40, 40, 508, 560);
            getContentPane().add(bg);

            getContentPane().repaint();

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (checkVictory()) {
            return;
        }
        int keyCode = e.getKeyCode();
        //37,38,39,40对应左,上,右,下

        if (keyCode == 37) {
            System.out.println("向左移动");
            if (y < 3) {
                arr[x][y] = arr[x][y + 1];
                arr[x][y + 1] = 0;
                y++;
                count++;
            }
            //每次移动完成之后重新打印
            initImage();
        } else if (keyCode == 38) {
            System.out.println("向上移动");
            if (x < 3) {
                arr[x][y] = arr[x + 1][y];
                arr[x + 1][y] = 0;
                x++;
                count++;
            }
            initImage();

        } else if (keyCode == 39) {
            System.out.println("向右移动");
            if (y > 0) {
                arr[x][y] = arr[x][y - 1];
                arr[x][y - 1] = 0;
                y--;
                count++;
            }
            initImage();
        } else if (keyCode == 40) {
            System.out.println("向下移动");
            if (x > 0) {
                arr[x][y] = arr[x - 1][y];
                arr[x - 1][y] = 0;
                x--;
                count++;
            }
            initImage();
        } else if (keyCode == 65) {
            initImage();
        } else if (keyCode == 87) {
            //这里如果直接把winArray赋值给arr,arr就指向了winArray那块空间,原本arr数组的空间就泄漏了
            //之后的checkVictory方法无论怎么比较都是为真,因为比较同一个数组必然相等.
            //以后作弊功能不要直接传址,要在创建一个二维数组.
            arr = new int[][] {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }
    }

    public boolean checkVictory() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != winArray[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        if (object == replayGame) {

            initDate();
            count = 0;
            initImage();

        } else if (object == closeGame) {
            System.out.println("关闭游戏");
            System.exit(0);
        } else if (object == reLogin) {
            setVisible(false);
            new LoginJFrame();
        } else if (object == officialAccounts) {
            JLabel jLabel = new JLabel(new ImageIcon("D:\\Code\\itheima\\JavaSE-OOA\\day16-code\\image\\img.png"));
            jLabel.setSize(646, 698);
            //JDialog和JFrame可以理解为相似,两者方法几乎类似
            JDialog jDialog = new JDialog();

            //设置弹框大小
            jDialog.setSize(700, 800);

            //设置弹框的标题
            jDialog.setTitle("收款码");

            //设置弹框永远居中
            jDialog.setLocationRelativeTo(null);

            //把jLabel添加到到弹框中
            jDialog.getContentPane().add(jLabel);

            //设置当前页面永远在最上层
            jDialog.setAlwaysOnTop(true);

            //设置不关闭弹窗无法操作
            jDialog.setModal(true);

            //显示弹窗
            jDialog.setVisible(true);
        }
    }
}
