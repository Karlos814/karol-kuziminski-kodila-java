package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Reader;
import com.kodilla.spring.reader.ReaderConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.toDoList.tasks.add("XXX");
        String tasksToDo = board.toDoList.tasks.get(0);

        board.inProgressList.tasks.add("YYY");
        String tasksInProgress = board.inProgressList.tasks.get(0);

        board.doneList.tasks.add("ZZZ");
        String tasksDone = board.doneList.tasks.get(0);
        //Then
        System.out.println("Task to do: "+tasksToDo);
        System.out.println("Task in progress: "+tasksInProgress);
        System.out.println("Task done: "+tasksDone);
    }
}
