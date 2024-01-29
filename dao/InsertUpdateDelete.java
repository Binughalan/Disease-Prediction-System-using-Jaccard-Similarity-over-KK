/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author binug
 */
public class InsertUpdateDelete {
    
    public static void setData(String query,String msg) {
        Connection con=null;
        Statement st=null;
        try {
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            st.executeUpdate(query);
            if (!msg.equals("")) {
                JOptionPane.showMessageDialog(null,  msg);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try {
            
        } catch (Exception e) {
        }
        }
    }
}
