package com.fengkuangJava;

import java.io.FileInputStream;
import java.io.IOException;

public class Demomain {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("a.txt");

        }catch (IOException e){
            System.out.println(e.getMessage());//运行结果：a.txt（系统找不到指定的文件。）
            return;//语句强制方法返回

            //使用exit退出虚拟机
            //System.exit(1);

        } finally {
            //关闭磁盘文件，回收资源
            if (fis!=null){
                try{
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            System.out.println("执行finally块里面的资源回收！！！");
        }

    }
}
