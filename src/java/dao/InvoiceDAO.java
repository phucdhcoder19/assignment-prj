/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Invoice;
import mylib.DBUtils;

/**
 *
 * @author ADMIN
 */
public class InvoiceDAO {

    public ArrayList<Invoice> getInvoices(String custID, String date) {
        ArrayList<Invoice> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = DBUtils.getConnection();
            String sql = "SELECT [invoiceID], [invoiceDate], [salesID], [carID],  [custID]\n"
                    + "FROM [dbo].[SalesInvoice]\n"
                    + "WHERE [custID] = ? and [invoiceDate] like ?";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, custID);
            st.setString(2, "%" + date + "%");
            ResultSet table = st.executeQuery();
            if (table != null) {
                while (table.next()) {
                    String invoiceID = table.getString("invoiceID");
                    String invoiceDate = table.getString("invoiceDate");
                    String salesID = table.getString("salesID");
                    String carID = table.getString("carID");
                    Invoice i = new Invoice(invoiceID, custID, salesID, carID, invoiceDate);
                    list.add(i);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
