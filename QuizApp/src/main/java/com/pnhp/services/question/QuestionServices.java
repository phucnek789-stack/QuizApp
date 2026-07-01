/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pnhp.services.question;

import com.pnhp.pojo.Category;
import com.pnhp.pojo.Question;
import com.pnhp.utils.MyConnSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class QuestionServices {
    public List<Question> getQuestion(){
        Connection conn = MyConnSingleton.getInstance().connect();

        String sql = "SELECT * FROM Question";
        PreparedStatement stm = conn.prepareCall(sql);
        ResultSet rs = stm.executeQuery();

        List<Question> questions = new ArrayList<>();
        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");

               cates.add(new Category(id, name));
        }
        return cates;
    }
}
