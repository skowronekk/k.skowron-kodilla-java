package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class TaskList {
    private List<String> tasks = new ArrayList<>();

    public List<String> getTasks() {
        return tasks;
    }
}
