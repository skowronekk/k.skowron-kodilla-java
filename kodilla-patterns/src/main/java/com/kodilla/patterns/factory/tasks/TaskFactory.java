package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Driving a car", "in Gdansk", "car");

            case PAINTINGTASK:
                return new PaintingTask("Painting a wall", "blue", "wall");

            case SHOPPINGTASK:
                return new ShoppingTask("Shopping an apples", "apples", 1.5);
            default:
                return null;
        }
    }
}
