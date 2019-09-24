package pl.kopka.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.kopka.patterns.Logger;

public class LoggerTestSuite {

    @BeforeClass
    public static void createInstanceClass() {
        Logger.getInstance();
    }

    @Test
    public void testGetLastLog() {
        String log = "Test log";
        Logger.getInstance().log(log);

        Assert.assertEquals(Logger.getInstance().getLastLog(), log);
    }
}
