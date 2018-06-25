package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    private TaskList toDoList;
    @Autowired
    @Qualifier("inProgressList")
    private TaskList inProgressList;
    @Autowired
    @Qualifier("doneList")
    private TaskList doneList;

    @Bean(name="toDoList")
    public TaskList getToDoList() {
        return new TaskList();
    }
    @Bean(name="inProgressList")
    public TaskList getInProgressList() {
        return new TaskList();
    }
    @Bean(name="doneList")
    public TaskList getDoneList() {
        return new TaskList();
    }
    @Bean
    public Board createBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }

}
