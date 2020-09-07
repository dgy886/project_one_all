package paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;

public class DrawPictureFrame extends JFrame {
    BufferedImage image =new BufferedImage(570,390, BufferedImage.TYPE_INT_BGR);//获得图像的绘图对象
    Graphics gs=image.getGraphics();//获得图像的绘图对象
    Graphics2D g= (Graphics2D) gs;
    DrawPictureCanvas canvas=new DrawPictureCanvas();
    Color foreColcr= Color.BLACK;
    Color backgroundColor= Color.white;
    int x=-1;
    int y=-1;
    boolean rubber=false;
    private JToolBar toolBar;//工具栏
    private JButton eraserButton;//橡皮按钮
    private JToggleButton strokeButton1;
    private JToggleButton StrokeButton2;
    private JToggleButton strokeButton3;
    private JButton backgroundButton;
    private JButton foregroundButton;
    private JButton clearButton;


    public DrawPictureFrame(){
        setResizable(false);//窗口大小不能改变
        setTitle("画图程序");//设置标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//窗体关闭则停止程序
        setBounds(500,100,574,460);
        init();//组件初始化
        addListener();//添加组件监听
    }
    /**
     * 组件初始化
     */
    private void init(){
        g.setColor(backgroundColor);
        g.fillRect(0,0,570,390);//填满整个画布
        g.setColor(foreColcr);
        canvas.setImage(image);
        getContentPane().add(canvas);
    }

    private void addListener(){
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(final MouseEvent e) {//当鼠标拖拽时触发的事件
                if (x>0&&y>0){
                    if (rubber){
                        g.setColor(backgroundColor);
                        g.fillRect(x,y,10,10);
                    }else{
                        g.drawLine(x,y,e.getX(),e.getY());
                    }
                }
                x=e.getX();
                y=e.getY();
                canvas.repaint();//更新画布
            }
        });
        canvas.addMouseListener(new MouseAdapter() {//当按键抬起时
            @Override
            public void mouseReleased(final MouseEvent arg0) {
                x=-1;//将记录上一次鼠标绘制点的横坐标恢复成-1
                y=-1;
            }
        });
    }

    public static void main(String[] args) {
        DrawPictureFrame frame=new DrawPictureFrame();//创建窗体对象
        frame.setVisible(true);
    }
}
