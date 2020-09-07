package paint;

import java.awt.*;

public class DrawPictureCanvas extends Canvas {
    private Image image=null;
     public void setImage(Image image){
         this.image=image;
     }

    /**
     *
     * @param g
     * 重写paint（）方法，在画布上绘制图像
     * update()方法也是同样的道理
     */
     public void paint(Graphics g){
         g.drawImage(image,0,0,null);
     }
     public void update(Graphics g){
         paint(g);
     }
}
