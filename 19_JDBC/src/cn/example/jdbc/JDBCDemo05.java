package cn.example.jdbc;

/*
* 定义一个方法，查询tb_address表的数据并将其封装为对象，然后装载集合，返回结果
* */

import cn.example.domain.Address;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JDBCDemo05 {

    public static void main(String[] args) {
        List<Address> list = new JDBCDemo05().findAll();
        Iterator<Address> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(list.size());
    }


    /**
     * 查询所有address对象
     * @return
     */
    public List<Address> findAll(){

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Address> list =null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            conn = DriverManager.getConnection("jdbc:mysql:///leyou", "root", "root");
            //3.定义sql
            String sql = "select * from tb_address";
            //4.获取执行sql的对象
            stmt = conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6.遍历集合，封装对象，装载集合
            Address addr = null;
            list = new ArrayList<Address>();
            while (rs.next()) {
                int id = rs.getInt("id");
                int user_id = rs.getInt("user_id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String zip_code = rs.getString("zip_code");
                String state = rs.getString("state");
                String city = rs.getString("city");
                String district = rs.getString("district");
                String address = rs.getString("address");
                int default_address = rs.getInt("default_address");
                String label = rs.getString("label");

                //创建addr对象
                addr = new Address();
                addr.setId(id);
                addr.setUser_id(user_id);
                addr.setName(name);
                addr.setPhone(phone);
                addr.setZip_code(zip_code);
                addr.setState(state);
                addr.setCity(city);
                addr.setDistrict(district);
                addr.setAddress(address);
                addr.setDefault_address(default_address);
                addr.setLabel(label);

                //装载集合
                list.add(addr);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            //释放资源
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            //释放资源
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            //释放资源
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return list;
    }
}
