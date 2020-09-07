package com.dong.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class ImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //让浏览器3秒进行一个刷新
        resp.setHeader("refresh","3");
        //在内存中创建一张图片
        BufferedImage image = new BufferedImage(80, 20, BufferedImage.TYPE_INT_RGB);
        //得到图片
        Graphics2D graphics = (Graphics2D) image.getGraphics();//笔
        //设置图片的背景颜色
        graphics.setColor(Color.white);
        graphics.fillRect(0,0,80,20);
        //  给图片写数据
        graphics.setColor(Color.blue);
        graphics.setFont(new Font(null,Font.BOLD,20));
        graphics.drawString(makeNum(),0,20);
        resp.setContentType("image/png");
        resp.setDateHeader("expires",-1);

        resp.setHeader("Cache-Control","no-cache");
        resp.setHeader("Pragma","no-cache");
        ImageIO.write(image,"png",resp.getOutputStream());
    }
    private String makeNum(){
        Random random = new Random();
        String num = random.nextInt(9999999) + "";
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i <7-num.length() ; i++) {
            buffer.append("0");
        }
        num=buffer.toString()+num;
        return num;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
