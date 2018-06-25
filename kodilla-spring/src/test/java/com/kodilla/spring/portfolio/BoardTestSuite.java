package com.kodilla.spring.portfolio;



import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)

public class BoardTestSuite {
    @Autowired
    private Board board;
    @Test
    public void testTaskList() {
        //Given

        //When
        board.getToDoList().getTasks().add("the task nr 1");
        //Then
        Assert.assertEquals("the task nr 1", board.getToDoList().getTasks().get(0));

    }
}