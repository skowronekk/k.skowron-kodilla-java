package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("onion")
                .burgers(2)
                .bun("with sesame")
                .sauce("barbecue")
                .ingredient("bacon")
                .ingredient("chilli")
                .ingredient("cucumber")
                .ingredient("mushrooms")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(5, howManyIngredients);
        Assert.assertEquals(2, bigmac.getBurgers());
        Assert.assertEquals("barbecue", bigmac.getSauce());
    }
}
