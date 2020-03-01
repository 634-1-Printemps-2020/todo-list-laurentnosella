package ch.hesge.cours634.todolist;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TodoListTest {

    TodoList todoTest;
    String creator = "Testor";
    String description = "This is a test";
    LocalDate creationDate = LocalDate.now();
    String status = "open";

    @Test
    public void createCorrectTask() throws TodoListException {
        todoTest = new TodoList();
        todoTest.createTask(creator,description,creationDate,status);
        Assert.assertEquals(1,todoTest.getTodoList().size());
    }

    @Test (expected = TodoListException.class)
    public void createIncorrectTask() throws TodoListException {
        todoTest = new TodoList();
        todoTest.createTask(creator,description,creationDate.minusDays(1),status);
    }

    @Test
    public void cancelCorrectTask() throws TodoListException {
        todoTest = new TodoList();
        todoTest.createTask(creator,description,creationDate,status);
        todoTest.cancelTask(todoTest.getTodoList().get(0));
        assertEquals(0,todoTest.getTodoList().size());
    }

    @Test (expected = TodoListException.class)
    public void cancelIncorrectTask() throws TodoListException {
        todoTest = new TodoList();
        todoTest.createTask(creator,description,creationDate,status);
        todoTest.cancelTask(todoTest.getTodoList().get(1));
    }

    @Test
    public void replanCorrectTask() throws TodoListException {
        todoTest = new TodoList();
        todoTest.createTask(creator,description,creationDate,status);
        todoTest.replanTask(todoTest.getTodoList().get(0),creationDate.plusDays(1));
        assertEquals(creationDate.plusDays(1),todoTest.getTodoList().get(1).getCreationDate());
    }

    @Test (expected = TodoListException.class)
    public void replanIncorrectTask() throws TodoListException {
        todoTest = new TodoList();
        todoTest.createTask(creator,description,creationDate,status);
        todoTest.replanTask(todoTest.getTodoList().get(1),creationDate.plusDays(1));
    }
}