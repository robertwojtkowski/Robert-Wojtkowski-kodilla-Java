package com.example.demo.forum;


import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    String username;


    public ForumUser(){
        this.username = "John Smith";
    }
}
