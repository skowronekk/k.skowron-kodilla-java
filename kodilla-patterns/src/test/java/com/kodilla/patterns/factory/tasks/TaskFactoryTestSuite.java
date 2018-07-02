package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
        Assert.assertEquals("Driving a car", drivingTask.getTaskName());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals(paintingTask.getTaskName(), paintingTask.executeTask());
        Assert.assertEquals("Painting a wall", paintingTask.getTaskName());
    }

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
        Assert.assertEquals("Shopping an apples", shoppingTask.getTaskName());

    }
}
