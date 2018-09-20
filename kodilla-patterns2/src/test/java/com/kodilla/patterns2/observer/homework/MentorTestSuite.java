package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        StudentTasks kateTasks = new KateTasks();
        StudentTasks markTasks = new MarkTasks();
        StudentTasks tomTasks = new TomTasks();
        Mentor jhonSmith = new Mentor("Jhon Smith");
        Mentor ivoneEscobar = new Mentor("Ivone Escobar");
        kateTasks.registerObserver(jhonSmith);
        tomTasks.registerObserver(ivoneEscobar);
        markTasks.registerObserver(jhonSmith);

        //When
        kateTasks.addTask("14.1 Rest API I");
        markTasks.addTask("15.2 Stream");
        kateTasks.addTask("14.2 Rest API II");
        tomTasks.addTask("8.2 Loop");
        markTasks.addTask("16.1 Hibernate");

        //Then
        assertEquals(4, jhonSmith.getUpdateCount());
        assertEquals(1, ivoneEscobar.getUpdateCount());

    }
}
