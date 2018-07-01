package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mark = new YGeneration("Mark Blue");
        User kate = new ZGeneration("Kate Red");
        User joe = new Millenials("Joe Black");

        //When
        String markUse = mark.sharePost();
        System.out.println("Mark use: " + markUse);
        String kateUse = kate.sharePost();
        System.out.println("Kate use: " + kateUse);
        String joeUse = joe.sharePost();
        System.out.println("Joe use: " + joeUse);

        //Then
        Assert.assertEquals("Twitter", markUse);
        Assert.assertEquals("Facebook", kateUse);
        Assert.assertEquals("Snapchat", joeUse);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User mark = new YGeneration("Mark Blue");

        //When
        String markUse = mark.sharePost();
        System.out.println("Mark use: " + markUse);
        mark.setSocialMedia(new SnapchatPublisher());
        markUse = mark.sharePost();
        System.out.println("Mark use: " + markUse);

        //Then
        Assert.assertEquals("Snapchat", markUse);
    }
}


