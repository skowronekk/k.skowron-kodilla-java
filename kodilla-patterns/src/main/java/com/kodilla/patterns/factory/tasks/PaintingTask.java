package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;

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
            System.out.println("Painting task is executed");
            return true;
        } else {
            System.out.println("Painting task isn't executed");
            return false;
        }
    }
}
