package com.xukuo.user;

import java.sql.*;

//jdbc工具类 简称jdbc编程
public class DBUtil {
    public static void main(String[] args) {
        /*
           工具类中的构造方法都是私有的。
           工具类当中的方法都是静态的，不需要new对象，直接通过类名调用
         */


    }
    private DBUtil(){}
    static {//静态代码块  在类加载时执行，且只执行一次
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * h获取数据库连接对象
     * @return连接对象
     * @throws SQLException
     */
    public  static Connection getConnection() throws SQLException{
        return   DriverManager.getConnection("jdbc:mysql://localhost:3306/lining","root","123456");

    }

    /**
     *
     * @param connection 连接对象
     * @param statement 数据库操作对象
     * @param resultSet 结果集
     */
    public  static  void close(Connection connection, Statement statement, ResultSet resultSet){
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(statement!=null){
            try {
               statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public  static  void close(Connection connection, PreparedStatement statement, ResultSet resultSet){
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
