package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;

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
        System.out.println("Shopping task is executed");
            return true;
        } else {
            System.out.println("Shopping task isn't executed");
            return false;

        }
    }
}

