package ch.hesge.cours634.todolist;

import java.time.LocalDate;

/*
Le système doit exposer une interface de service pour les utilisateurs qui permet de

créer une tâche
annuler une tâche
replanifier une tâche
consulter ses tâches ou les tâches des autres avec possibilité de filtrage sur le status ou la date d’exécution
 */
public interface ITodoList {

    void createTask(String creator, String description, LocalDate creationDate, String status, String resolution) throws TodoListException;

    void cancelTask(Task taskToCancel) throws TodoListException;

    void replanTask(Task taskToReplan,LocalDate date) throws TodoListException;

    void displayTodoList();

}
