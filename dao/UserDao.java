/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;

/**
 *
 * @author binug
 */
public class UserDao {

    public static void save(User admin) {
        String query = "insert into admin(name,email,mobileNumber,address,password,securityQuestion,answer,status)values('" + admin.getName() + "','"
                + admin.getEmail() + "','" + admin.getMobileNumber() + "','" + admin.getAddress()
                + "','" + admin.getPassword() + "','" + admin.getSecurityQuestion() + "','"
                + admin.getAnswer() + "','" + "null" + "')";
        DbOperation.setDataorDelete(query, "Registered Successfully!");

    }

    public static User login(String email, String password) {
        User admin = null;
        try {
            ResultSet rs = DbOperation.getData("Select*from admin where email='" + email + "'and password='" + password + "'");
            while (rs.next()) {
                admin = new User();
                admin.setStatus(rs.getString("status"));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return admin;
    }

    public static User getSecurityQuestion(String email) {
        User admin = null;
        try {
            ResultSet rs = DbOperation.getData("select *from admin where email='" + email + "'");
            while (rs.next()) {
                admin = new User();
                admin.setSecurityQuestion(rs.getString("securityQuestion"));
                admin.setAnswer(rs.getString("answer"));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return admin;
    }

    public static void update(String email, String newPassword) {
        String query = "update admin set password='" + newPassword + "'where email='" + email + "'";
        DbOperation.setDataorDelete(query, "Password Changed Successfully");
    }

    public static User rlogin(String email, String password) {
        User receptionist = null;
        try {
            ResultSet rs = DbOperation.getData("Select*from receptionist where email='" + email + "'and password='" + password + "'");
            while (rs.next()) {
                receptionist = new User();
                receptionist.setStatus(rs.getString("status"));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return receptionist;
    }

}
