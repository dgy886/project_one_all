package cn.itcast.jdbc;

import cn.itcast.util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 练习：
 *  需求：
 *      1.通过键盘输入用户的账号和密码
 *      2.判断是否登录成功
 */
public class JdbcDemo8 {

    public static boolean login(String username,String password){
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        if (username==null||password==null){
            return false;
        }

        try {
            //1.连接数据库
            conn=JDBCUtils.getConnection();
            //2.定义sql
            String sql="select *from user where username='"+username+"' and password='"+password+"'";
            //获取执行sql对象
            stmt=conn.createStatement();
            //4.执行查询
            rs=stmt.executeQuery(sql);
            return rs.next();//如果有下一行，返回true
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stmt,conn);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username=in.next();
        System.out.println("请输入密码:");
        String password=in.next();
        if (login(username,password)){
            System.out.println("登录成功！！！");
        }else{
            System.out.println("登录失败！！！");
        }
    }
}
