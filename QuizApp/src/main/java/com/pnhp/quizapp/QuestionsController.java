/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.pnhp.quizapp;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            //B1 -> Nap driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //B2 -> Mo ket noi
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhouse/quizdb", "root", "root");
            
            //B3 -> Thuc thi truy van
            String sql = "SELECT * FROM Category";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                
                System.out.printf("%d - %s\n", id, name);
            }
            
            //B4 -> Dong ket noi
            conn.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }    
    
}
