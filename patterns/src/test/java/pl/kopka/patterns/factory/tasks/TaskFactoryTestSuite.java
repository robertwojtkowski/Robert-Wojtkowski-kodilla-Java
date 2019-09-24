package pl.kopka.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDriving(){
        TaskFactory taskFactory = new TaskFactory();
        Task driving = taskFactory.makeTask(TaskFactory.DRIVINNG);
        Assert.assertEquals(driving.getTaksName(), "Driving task");
        Assert.assertEquals(driving.isTaskExecuted(), false);
        driving.executeTask();
        Assert.assertEquals(driving.isTaskExecuted(), true);
    }

    @Test
    public void testFactoryPainting(){
        TaskFactory taskFactory = new TaskFactory();
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        Assert.assertEquals(painting.getTaksName(), "Painting task");
        Assert.assertEquals(painting.isTaskExecuted(), false);
        painting.executeTask();
        Assert.assertEquals(painting.isTaskExecuted(), true);
    }

    @Test
    public void testFactoryShopping(){
        TaskFactory taskFactory = new TaskFactory();
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        Assert.assertEquals(shopping.getTaksName(), "Shopping task");
        Assert.assertEquals(shopping.isTaskExecuted(), false);
        shopping.executeTask();
        Assert.assertEquals(shopping.isTaskExecuted(), true);

    }

}
