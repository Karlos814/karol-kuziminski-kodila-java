package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOP = "SHOPPING";
    public static final String PAINT = "PAINTING";
    public static final String DRIVE = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOP:
                return new ShoppingTask("Helps with shopping", "car", 12345);
            case PAINT:
                return new PaintingTask("Helps with painting", "blue", "hause");
            case DRIVE:
                return new DrivingTask("Helps with driving", "school", "bike");
            default:
                return null;
        }

    }
}
