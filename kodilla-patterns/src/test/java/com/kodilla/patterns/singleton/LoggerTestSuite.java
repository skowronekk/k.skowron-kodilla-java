package com.kodilla.patterns.singleton;

import org.junit.*;

public class LoggerTestSuite {
    @BeforeClass
    public static void showLog() {
        Logger.getInstance().log("user Jan Kowalski add new post");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last log: " + lastLog);
        //Then
        Assert.assertEquals("user Jan Kowalski add new post", lastLog);
    }
}
