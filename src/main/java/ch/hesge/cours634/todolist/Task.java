package ch.hesge.cours634.todolist;

import java.time.LocalDate;

/*
Avant de créer une tâche il faut valider ses données, par exemple ne pas accepter une tâche planifiée dans le passé.
Une tâche indique au minimum :

le créateur de la tâche
une description de la tâche
date d’exécution planifiée
status (open, closed, canceled)
résolution (done, ignored)
 */
public class Task {

    private String creator;
    private String description;
    private LocalDate creationDate;
    private String status;
    private String resolution;

    public Task(String creator, String description, LocalDate creationDate, String status) throws TodoListException {
        this.creator = creator;
        this.description = description;
        checkCoherentCreationDate(creationDate);
        this.creationDate = creationDate;
        checkTodoListStatus(status);
        this.status = status;
    }

    public String getCreator() {
        return creator;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) throws TodoListException {
        checkCoherentCreationDate(creationDate);
        this.creationDate = creationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) throws TodoListException {
        checkTodoListStatus(status);
        this.status = status;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) throws TodoListException {
        checkTodoListResolution(resolution);
        this.resolution = resolution;
    }

    private void checkTodoListStatus(String status) throws TodoListException {
        if (!status.equals("open")&&(!status.equals("closed")&&(!status.equals("canceled")))){
            throw new TodoListException("Status error : can only be open, closed or canceled");
        }
    }

    private void checkTodoListResolution(String resolution) throws TodoListException {
        if (!resolution.equals("done") && (!resolution.equals("canceled"))){
            throw new TodoListException("Resolution error : can only be done or canceled");
        }
    }

    private void checkCoherentCreationDate(LocalDate creationDate) throws TodoListException {
        if (creationDate.compareTo(LocalDate.now()) < 0){
            throw new TodoListException("Creation date error : earlier than today");
        }
    }
}
