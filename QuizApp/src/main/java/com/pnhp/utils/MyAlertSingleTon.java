/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pnhp.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyAlertSingleTon {
    private static MyAlertSingleTon instance;
    private final Alert alert;
    
    private MyAlertSingleTon(){
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("quizapp");
        alert.setHeaderText("Quiz App");
    }
    
    public static MyAlertSingleTon getInstance(){
        if(instance == null)
            instance = new MyAlertSingleTon();
        return instance;
    }
    
    public void showMessage(String content){
        this.alert.setContentText(content);
        this.alert.show();
    }
}
