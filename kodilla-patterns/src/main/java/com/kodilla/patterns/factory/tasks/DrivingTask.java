package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        System.out.println("Task is executing");
        return taskName;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (true) {
            System.out.println("Driving task is executed");
            return true;
        } else {
            System.out.println("Driving task isn't executed");
            return false;
        }
    }
}



