package ch.hesge.cours634.todolist;

import org.junit.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TaskTest {

    Task taskTest;
    String creator = "Testor";
    String description = "This is a test";
    LocalDate creationDate = LocalDate.now();
    String status = "open";

    @Test
    public void setCorrectCreationDate() throws TodoListException {
        taskTest = new Task(creator,description,creationDate,status);
        taskTest.setCreationDate(creationDate.plusDays(1));
        Assert.assertEquals(creationDate.plusDays(1),taskTest.getCreationDate());
    }

    @Test (expected = TodoListException.class)
    public void setIncorrectCorrectCreationDate() throws TodoListException {
        taskTest = new Task(creator,description,creationDate,status);
        taskTest.setCreationDate(creationDate.minusDays(1));
    }

    @Test
    public void setCorrectStatus() throws TodoListException {
        taskTest = new Task(creator,description,creationDate,status);
        taskTest.setStatus("closed");
        Assert.assertEquals("closed",taskTest.getStatus());
    }

    @Test (expected = TodoListException.class)
    public void setIncorrectStatus() throws TodoListException {
        taskTest = new Task(creator,description,creationDate,status);
        taskTest.setStatus("error");
    }

    @Test
    public void setCorrectResolution() throws TodoListException {
        taskTest = new Task(creator,description,creationDate,status);
        taskTest.setResolution("done");
        Assert.assertEquals("done",taskTest.getResolution());
    }

    @Test (expected = TodoListException.class)
    public void setIncorrectResolution() throws TodoListException {
        taskTest = new Task(creator,description,creationDate,status);
        taskTest.setResolution("error");
    }
}