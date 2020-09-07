package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
    stu表 添加一条记录 insert语句
 */
public class JdbcDemo2 {
    public static void main(String[] args) throws Exception {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.定义sql
        String sql="insert into stu(id,name,score) values(22,'wwww',89)";
        //获取Connection对象
        Connection conn= DriverManager.getConnection("jdbc:mysql:///db1","root","root");
        //4.获取执行sql的对象Statement
        Statement stmt=conn.createStatement();
        //5.执行sql
        int count=stmt.executeUpdate(sql);
        //6.处理结果
        System.out.println(count);
        if (count>0){
            System.out.println("添加成功！！！");
        }else {
            System.out.println("添加失败");
        }
       stmt.close();
        conn.close();
    }
}
