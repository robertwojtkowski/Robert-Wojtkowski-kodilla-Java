package pl.kopka.patterns.factory.tasks;

public interface Task {
    void executeTask();
    String getTaksName();
    boolean isTaskExecuted();
}
