package com.example.demo.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example");

        Board board = context.getBean(Board.class);

        TaskList toDoList = board.toDoList;
        TaskList inProgressList = board.inProgressList;
        TaskList doneList = board.doneList;

        toDoList.addTask("kill the wolf");
        inProgressList.addTask("take the basket to grandma");
        doneList.addTask("pass through the forest");

        //When
        String toDoTask = toDoList.getTasks().get(0);
        String inProgressTask = inProgressList.getTasks().get(0);
        String doneTask = doneList.getTasks().get(0);

        //Then
        Assert.assertEquals("kill the wolf", toDoTask);
        Assert.assertEquals("take the basket to grandma", inProgressTask);
        Assert.assertEquals("pass through the forest", doneTask);


    }
}
