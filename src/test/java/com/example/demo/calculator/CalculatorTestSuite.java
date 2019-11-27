package com.example.demo.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    private static final double DELTA = 1e-15;
    @Test
    public void testCalculations(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.demo");
        Calculator calculator = context.getBean(Calculator.class);

        Assert.assertEquals(10.0, calculator.add(5.0, 5.0), DELTA);
        Assert.assertEquals(0, calculator.sub(5,5), DELTA);
        Assert.assertEquals(1.0, calculator.div(5.0,5.0), DELTA);
        Assert.assertEquals(25.0, calculator.mul(5.0,5.0), DELTA);

    }
}
