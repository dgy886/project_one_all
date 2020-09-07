package cn.itcast.jdbc;

import cn.itcast.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
    事务操作
 */
public class JdbcDemo9 {
    public static void main(String[] args) {
        //1.获取连接
        Connection conn=null;
        PreparedStatement ptmt1=null;
        PreparedStatement ptmt2=null;
        try {
            conn= JDBCUtils.getConnection();
            String sql1="update stu set score=score-? where id=?";
            String sql2="update stu set score =score+? where id=?";
            //获取sql对象
            ptmt1 = conn.prepareStatement(sql1);
            ptmt2 = conn.prepareStatement(sql2);
            //设置参数
            ptmt1.setDouble(1,10);
            ptmt1.setInt(2,1);
            ptmt2.setDouble(1,10);
            ptmt2.setInt(2,2);
            ptmt1.executeUpdate();
            ptmt2.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtils.close(ptmt1,conn);
            JDBCUtils.close(ptmt2,null);
        }
    }
}
