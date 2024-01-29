/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import javax.swing.JOptionPane;

/**
 *
 * @author binug
 */
public class tables {
    public static void main(String[] args) {
        try {
            //String userTable="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE(email))";
            String roomTable="create table room(roomno varchar(10) primary key,floor varchar(200),type varchar(200),capacity int(20),charge varchar(200))";
            DbOperation.setDataorDelete(roomTable, "Room Table created successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
