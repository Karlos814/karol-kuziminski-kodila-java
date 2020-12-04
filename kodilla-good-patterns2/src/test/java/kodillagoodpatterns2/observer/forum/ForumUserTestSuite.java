package kodillagoodpatterns2.observer.forum;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ForumUserTestSuite {

    @Test
    public void testUpdate(){
        //Given
        ForumTopic javaHelp= new JavaHelpForumTopic();
        ForumTopic javaTools= new JavaToolsForumTopic();
        ForumUser john = new ForumUser(("John"));
        ForumUser ivone = new ForumUser(("Ivone"));
        ForumUser jessie = new ForumUser(("Jessie"));
        javaHelp.registerObserver(john);
        javaHelp.registerObserver(jessie);
        javaTools.registerObserver(ivone);
        javaTools.registerObserver(jessie);
        //When
        javaHelp.addPost("Hi, it's me");
        javaHelp.addPost("Help me");
        javaHelp.addPost("Ok, It's running");
        javaTools.addPost("MySQL");
        javaTools.addPost("hmmmm");
        //Then
        assertEquals(3, john.getUpdateCount());
        assertEquals(2, ivone.getUpdateCount());
        assertEquals(5, jessie.getUpdateCount());
    }

}