/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pnhp.pojo;

import java.util.List;

/**
 *
 * @author admin
 */
public class Question {
    private int id;
    private String content;
    private String hint;
    private String image;
    private Category categogy;
    private Level level;
    private List<Choice> choices;
    
    private Question(Builder b){
        this.id = b.id;
        this.content = b.content;
        this.hint = b.hint;
        this.image = b.image;
        this.categogy = b.category;
        this.level = b.level;
        this.choices = b.choices;
    }
    
    static class Builder{
        private int id;
        private String content;
        private String hint;
        private String image;
        private Category category;
        private Level level;
        private List<Choice> choices;
        
        public Builder setContent(String content){
            this.content = content;
            return this;
        }
        
        public Builder setHint(String hint){
            this.hint = hint;
            return this;
        }
        
         public Builder addChoice(Choice c){
            this.choices.add(c);
            return this;
        }
         
         //...
         
         public Question build(){
             return new Question(this);
         }
    }
}
