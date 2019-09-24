package pl.kopka.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean isTaskExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("[Execute Task "+ this.taskName + "]");
        System.out.println("Bought " + this.whatToBuy + " in " + this.quantity);
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
