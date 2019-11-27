package com.example.demo.reader;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReaderTestSuite {

    @Test
    public void testRead(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ReaderConfig.class);
        Reader reader = context.getBean(Reader.class);
        reader.read();
    }

    @Test
    public void testConditional(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ReaderConfig.class);

        boolean book2Exists = context.containsBean("book2");

        System.out.println("Bean book 2 was found in the container: " + book2Exists);
    }
}
