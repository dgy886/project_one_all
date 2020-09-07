package com.fengkuangJava.awt;

import javax.swing.Timer;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.LambdaConversionException;
import java.util.Random;
import java.util.function.Consumer;

import static java.lang.Character.getType;


public class PinBall {
    //桌面的宽度
    private final int TABLE_WIDTH=300;
    //桌面的高度
    private final int TABLE_HEIGHT=400;
    //球拍的垂直位置
    private final int RECKET_Y=340;
    //下面定义球拍的高度和宽度
    private final int RECKET_HEIGHT=20;
    private final int RECKET_WIDTH=60;
    //小球的大小
    private final int BALL_SIZE=16;
    private Frame f=new Frame("弹球游戏");
    Random rand=new Random();
    //小球的运行速度
    private int yspeed=10;
    //返回一个-0.5-0.5的比率，用于控制小球的运行方向
    private double xyRate=rand.nextDouble()-0.5;
    //小球横向的运行速度
    private int xpeed=(int)(yspeed*xyRate*2);
    //ballX和ballY代表小球的坐标
    private int ballX=rand.nextInt(200)+20;
    private int ballY=rand.nextInt(10)+20;
    //racketX代表球拍的水平坐标
    private int racketX=rand.nextInt(200);
    private MyCanvas tableArea=new MyCanvas();
    Timer timer;
    //游戏是否结束的旗标
    private boolean isLose=false;
    public void init(){
        //设置桌面区域的最佳大小
        tableArea.setPreferredSize(new Dimension(TABLE_WIDTH,TABLE_HEIGHT));
        f.add(tableArea);
        //定义键盘监听器
        var keyProcessor=new KeyAdapter(){
            public void keyPressed(KeyEvent ke){
                if (ke.getKeyCode()==KeyEvent.VK_LEFT){
                    if (racketX>0){
                        racketX-=10;
                    }
                }
                if (ke.getKeyCode()==KeyEvent.VK_RIGHT){
                    if(racketX<TABLE_WIDTH-RECKET_WIDTH){
                        racketX+=10;
                    }
                }
            }
        };
        //为窗口和tableArea对象分别添加键盘监听器
        f.addKeyListener(keyProcessor);
        tableArea.addKeyListener(keyProcessor);
        //定义每0.1秒执行一次的事件监听器
         //var taskPerformer =
        timer=new Timer(100,evt -> {
            //如果小球碰到左边框
            if (ballX <= 0 || ballX >= TABLE_WIDTH - BALL_SIZE) {
                xpeed = -xpeed;
            }
            //如果小球高度超出了球拍位置，且横向不在球拍范围内，游戏结束
            if (ballY >= RECKET_Y - BALL_SIZE && (ballX < racketX || ballX > racketX + RECKET_WIDTH)) {
                timer.stop();
                //设置游戏是否结束的旗帜为true
                isLose = true;
                tableArea.repaint();
            }
            //如果小球位于球拍之内，且到达球拍位置，小球反弹
            else if (ballY <= 0 || (ballY >= RECKET_Y - BALL_SIZE && ballX > racketX && ballX <= racketX + RECKET_WIDTH)) {
                yspeed = -yspeed;
            }
            //小球坐标增加
            ballY += yspeed;
            ballX += xpeed;
            tableArea.repaint();
        });
        timer.start();
        f.pack();
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new PinBall().init();

    }
    class MyCanvas extends Canvas{
        //重写Canvas的paint方法，实现绘图
        public void paint(Graphics g){
            //如果游戏结束
            if (isLose){
                g.setColor(new Color(255,0,0));
                g.setFont(new Font("Timer",Font.BOLD,30));
                g.drawString("游戏结束！",50,200);
            }
            //如果游戏还没有结束
            else {
                //设置颜色，并绘制小球
                g.setColor(new Color(240,240,80));
                g.fillOval(ballX,ballY,BALL_SIZE,BALL_SIZE);
                //设置球拍颜色
                g.setColor(new Color(80,80,200));
                g.fillRect(racketX,RECKET_Y,RECKET_WIDTH,RECKET_HEIGHT);
            }
        }
    }

}
