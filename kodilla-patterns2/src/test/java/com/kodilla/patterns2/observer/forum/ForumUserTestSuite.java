package com.kodilla.patterns2.observer.forum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser jhonSmith = new ForumUser("Jhon Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(jhonSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);

        //When
        javaHelpForum.addPost("Hi everyone! Could you help with for loop?");
        javaHelpForum.addPost("Better try use while loop in thi case");
        javaToolsForum.addPost("Help pls, my MySQL db doesn't want to work:(");
        javaHelpForum.addPost("Why while? is it better?");
        javaToolsForum.addPost("When i try to log in i got 'bad credentials' message.");

        //Then
        assertEquals(3, jhonSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());

    }
}
