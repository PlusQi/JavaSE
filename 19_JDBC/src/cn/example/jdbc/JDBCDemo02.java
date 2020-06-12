package cn.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
* insert 语句 添加一条记录
* */
public class JDBCDemo02 {
    public static void main(String[] args){
        Statement stmt = null;
        Connection conn = null;
        try {
            //1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2. 获取Connection对象
            conn = DriverManager.getConnection("jdbc:mysql:///leyou", "root", "root");
            //3. 定义sql
            String sql = "insert into tb_address values(null, 30, '王五', 18866666666, 123456," +
                    " '浙江省', '杭州', '西湖', '西湖', 1, '公司')";
            //4. 获取执行sql的对象 Statement
            stmt = conn.createStatement();
            //5. 执行sql
            int count = stmt.executeUpdate(sql); //统计受影响的行数
            //6. 处理结果
            System.out.println(count);

            if (count > 0){
                System.out.println("添加成功！");
            }else {
                System.out.println("添加失败！");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //7. 释放资源
            //stmt.close();
            //避免空指针异常释放资源前先判断
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }






    }
}
