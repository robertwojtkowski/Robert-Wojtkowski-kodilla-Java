package pl.kopka.patterns.factory.tasks;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isTaskExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("[Execute Task "+ this.taskName + "]");
        System.out.println("Painted " + this.whatToPaint + " in " + this.color);
        this.isTaskExecuted = true;
    }

    @Override
    public String getTaksName() {
        return this.taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return this.isTaskExecuted;
    }
}
