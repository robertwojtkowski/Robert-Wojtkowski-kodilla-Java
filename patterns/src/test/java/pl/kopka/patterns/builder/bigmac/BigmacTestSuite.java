package pl.kopka.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BigmacTestSuite {

    @Test
    public void testCheckersBuilder() throws BigmacException {

        List<String> availableIngriedients = Arrays.asList("lettuce", "onion", "bacon", "cucumber", "chilli pepper", "mushroom", "shrimps", "cheese");
        List<String> availableBuns = Arrays.asList("with sesame", "without sesame");
        List<String> availableSauces = Arrays.asList("standard", "1000 islands", "barbecue");
        int maxBurgers = 3;


        Bigmac bigmac = new Bigmac.BigmacBuilder(availableIngriedients, availableBuns, availableSauces, maxBurgers)
                .bun("without sesame")
                .burgers(2)
                .sauce("1000 islands")
                .ingridients("onion")
                .ingridients("bacon")
                .ingridients("chilli pepper")
                .build();

        Assert.assertEquals(3, bigmac.getIngridients().size());
        Assert.assertEquals("without sesame", bigmac.getBun());
        Assert.assertEquals(2, bigmac.getBurgers());
    }
}
