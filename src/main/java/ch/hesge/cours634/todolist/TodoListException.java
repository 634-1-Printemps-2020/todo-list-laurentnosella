package ch.hesge.cours634.todolist;

/*
Toute action non autorisée doit provoquer le lancement d'une exception.
L'exception doit comprendre suffisamment d'information sur la nature du problème.
 */
public class TodoListException extends Exception {
    public TodoListException(String message) {
        super(message);
    }
}
