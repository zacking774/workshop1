/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dbutils.DBUtils;
import dto.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author LOQ
 */
public class UserDAO {
    public User getUser(String phoneNumber,String password){
        User result=null;
        Connection cn=null;
        try {
            cn=DBUtils.getConnection();
            if(cn!=null){
                String sql = "select UserID,PhoneNumer,Password,FullName,Role,currentTierID,PointBalance,TotalSpent,TotalWashes,CreatedAt,Status\n"
                        + "from dbo.Users\n"
                        + "where PhoneNumber=? and Password=? ";
                PreparedStatement st=cn.prepareStatement(sql);
                st.setString(1, phoneNumber);
                st.setString(2, password);
                
                ResultSet table=st.executeQuery();
                while(table.next()){
                   int userId=table.getInt("UserID");
                   String name=table.getString("FullName");
                   String role=table.getString("Role");               
                   String tierId=table.getString("currentTierID");
                   int point=table.getInt("PointBalance");
                   double spent=table.getDouble("TotalSpent");
                   int washes=table.getInt("TotalWashes");
                   Date createDate=table.getDate("CreatedAt");
                   boolean status=table.getBoolean("status");
                   result=new User(userId, phoneNumber, password, name, role, tierId, point, spent, washes, createDate, status);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //buoc 4
                if(cn!=null) cn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return result;
    }
}
