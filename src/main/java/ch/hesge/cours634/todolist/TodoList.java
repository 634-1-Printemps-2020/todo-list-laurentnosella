package ch.hesge.cours634.todolist;

import java.time.LocalDate;
import java.util.ArrayList;

public class TodoList implements ITodoList {

    ArrayList<Task> todoList;

    public TodoList() {
    }

    @Override
    public void createTask(String creator, String description, LocalDate creationDate, String status, String resolution) throws TodoListException {
        Task newTask = new Task(creator,description,creationDate,status,resolution);
        todoList.add(newTask);
    }

    @Override
    public void cancelTask(Task taskToCancel) throws TodoListException {
        checkTaskCancelation(taskToCancel);
        todoList.get(todoList.indexOf(taskToCancel)).setStatus("canceled");
    }

    @Override
    public void replanTask(Task taskToReplan, LocalDate date) throws TodoListException {
        checkTaskReplanning(taskToReplan);
        todoList.get(todoList.indexOf(taskToReplan)).setCreationDate(date);
    }

    @Override
    public void displayTodoList() {
        System.out.println(todoList);
    }

    private void checkTaskCancelation(Task taskToCancel) throws TodoListException {
        if (!todoList.contains(taskToCancel)){
            throw new TodoListException("Task canceling error : task "+taskToCancel+" not in TodoList");
        }
    }

    private void checkTaskReplanning(Task taskToReplan) throws TodoListException {
        if (!todoList.contains(taskToReplan)){
            throw new TodoListException("Task replanning error : task "+taskToReplan+" not in Todolist");
        }
    }
}
