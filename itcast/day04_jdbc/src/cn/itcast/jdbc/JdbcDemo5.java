package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo5 {
    public static void main(String[] args) throws Exception {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.定义sql
        String sql="create table stu1(id int,name varchar(20))";
        //获取Connection对象
        Connection conn= DriverManager.getConnection("jdbc:mysql:///db1","root","root");
        //4.获取执行sql的对象Statement
        Statement stmt=conn.createStatement();
        //5.执行sql
        int count=stmt.executeUpdate(sql);
        //6.处理结果
        System.out.println(count);
        stmt.close();
        conn.close();
    }
}
