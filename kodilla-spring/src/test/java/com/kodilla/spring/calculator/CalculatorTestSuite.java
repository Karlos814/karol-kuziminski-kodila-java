package com.kodilla.spring.calculator;

import com.kodilla.spring.forum.ForumUser;
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
    @Test
    public void testGetUsername() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultAdd = calculator.add(2, 5);
        double resultSub = calculator.sub(5, 2);
        double resultMul = calculator.mul(2, 5);
        double resultDiv = calculator.div(10, 5);
        //Then
        Assert.assertEquals(7, resultAdd, 0.1);
        Assert.assertEquals(3, resultSub, 0.1);
        Assert.assertEquals(10, resultMul, 0.1);
        Assert.assertEquals(2, resultDiv, 0.1);
    }
}
