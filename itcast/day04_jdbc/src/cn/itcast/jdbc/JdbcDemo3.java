package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
    stu表 修改记录
 */
public class JdbcDemo3 {
    public static void main(String[] args) throws Exception {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.定义sql
        String sql="update stu set name ='qqq' where id=6";
        //3.获取conn对象
        Connection conn= DriverManager.getConnection("jdbc:mysql:///db1","root","root");
        //4.执行sql的对象方法statement
        Statement stmt=conn.createStatement();
        int count=stmt.executeUpdate(sql);
        System.out.println(count);
        if (count>0){
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败");
        }
        stmt.close();
        conn.close();
    }
}
