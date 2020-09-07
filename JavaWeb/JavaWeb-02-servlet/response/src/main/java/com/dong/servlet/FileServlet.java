package com.dong.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.要获取下载文件的路径
        String realPath = "E:\\CodeWorkSpace\\JavaWeb\\JavaWeb-02-servlet\\response\\target\\classes\\timg.jpg";
        System.out.println("下载文件的路径："+realPath);
        //2.下载的文件名是啥？
        String filename = realPath.substring(realPath.lastIndexOf("\\") + 1);
        //3.设置想办法让浏览器能够支持下载我们需要的东西
        resp.setHeader("Content-disposition","attachment;filename"+ URLEncoder.encode(filename,"utf-8"));
        //4.获取下载文件的输入流
        FileInputStream fileInputStream = new FileInputStream(realPath);
        //5.创建缓冲区
        int len=0;
        byte[] buffer=new byte[1024];
        //6.获取OutputStream对象
        ServletOutputStream outputStream = resp.getOutputStream();
        //7.使用FileOutputStream流写入到buffer缓冲区中，在通过buffer缓冲区输出到客户端
        while ((len=fileInputStream.read(buffer))>0){
            outputStream.write(buffer,0,len);
        }
        fileInputStream.close();
        outputStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
