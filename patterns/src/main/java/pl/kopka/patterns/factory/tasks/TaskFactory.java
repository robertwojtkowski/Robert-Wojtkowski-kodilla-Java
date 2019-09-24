package pl.kopka.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVINNG = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINNG:
                return new DrivingTask("Driving task", "Warsaw", "car");
            case PAINTING:
                return new PaintingTask("Painting task", "yellow", "flowers");
            case SHOPPING:
                return new ShoppingTask("Shopping task", "milk", 3);
            default:
                return null;
        }
    }

}
