package com.example.demo.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {


    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList toDoList(){
        return new TaskList();
    }


    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList inProgressList(){
        return new TaskList();
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList doneList(){
        return new TaskList();
    }


    @Bean
    public Board board() {
        return new Board(toDoList(), inProgressList(), doneList());
    }



}