package kodillagoodpatterns2.observer.homework;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TasksMentorTestSuite {

    @Test
    public void testUpdate(){
        //Given
        Task task1 = new Task("1");
        Task task2 = new Task("2");
        Task task3 = new Task("3");
        Task task4 = new Task("4");

        Mentor karol = new Karol();
        Mentor mateusz = new Mateusz();

        Tasks john = new Tasks("John");
        Tasks ivone = new Tasks("Ivone");
        Tasks jessie = new Tasks("Jessie");
        Tasks dominik = new Tasks("Dominik");

        john.registerObserver(mateusz);
        ivone.registerObserver(mateusz);
        jessie.registerObserver(karol);
        dominik.registerObserver(karol);

        //When
        john.addTask(task1);
        john.addTask(task3);
        ivone.addTask(task4);
        ivone.addTask(task2);
        ivone.addTask(task3);

        jessie.addTask(task1);
        jessie.addTask(task4);
        dominik.addTask(task1);
        dominik.addTask(task2);
        dominik.addTask(task3);
        dominik.addTask(task4);
        //Then
        assertEquals(5, mateusz.getUpdateCount());
        assertEquals(6, karol.getUpdateCount());
    }

}