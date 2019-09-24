package pl.kopka.patterns.factory.tasks;

public class DrivingTask implements Task{
    private String taskName;
    private String where;
    private String using;
    private boolean isTaskExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("[Execute Task "+ this.taskName + "]");
        System.out.println("Using " + this.using + " drove to " + this.where);
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
