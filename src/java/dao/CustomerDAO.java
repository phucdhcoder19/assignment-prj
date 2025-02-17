/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Customer;
import mylib.DBUtils;

/**
 *
 * @author user
 */
public class CustomerDAO {
    public Customer checkLogin(String name, String phone){
        Customer rs=null;
        Connection cn=null;
        try{
          cn=DBUtils.getConnection();
          if(cn!=null){
              String sql = "select custID,custName,phone,sex,cusAddress\n"
                      + "from dbo.Customer\n"
                      + "where custName = ? and phone=?";
              PreparedStatement st=cn.prepareStatement(sql);
              st.setString(1, name);
              st.setString(2, phone);
              ResultSet table=st.executeQuery();
                if(table!=null){
                  while(table.next()){
                      int custid=table.getInt("custID");
                      String custname=table.getString("custName");
                      //String phone=""+table.getString("phone");
                      String sex=table.getString("sex");
                      String custadd=table.getString("cusAddress");
                      rs=new Customer(custid, custname, phone, sex, custadd);
                      
                  }
              }
          }
        
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                if(cn!=null) cn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return rs;
    }
}
