# todo-list-laurentnosella
todo-list-laurentnosella created by GitHub Classroom
Le but de cet exercice est de développer un logiciel qui permet de gérer une liste de tâches, un TODO list

Les tâches peuvent concerner différents types de sujet comme :

prendre rendez-vous chez le médecin
préparer le contrôle 634
rendre visite aux parents
Une tâche indique au minimum :

le créateur de la tâche
une description de la tâche
date d’exécution planifiée 
status (open, closed, canceled)
résolution (done, ignored)
Le système doit exposer une interface de service pour les utilisateurs qui permet de 

créer une tâche
annuler une tâche
replanifier une tâche 
consulter ses tâches ou les tâches des autres avec possibilité de filtrage sur le status ou la date d’exécution 
Avant de créer une tâche il faut valider ses données, par exemple ne pas accepter une tâche planifiée dans le passé.

Toute action non autorisée doit provoquer le lancement d'une exception. L'exception doit comprendre suffisamment d'information sur la nature du problème.

Travail à réaliser

Identifier les composants métier de cette application et donner un diagramme qui décrit les relations entre ces entités
Implémenter le système, backend seulement. On ne vous demande pas d'implémenter un GUI.
Tester votre code avec junit, toutes les méthodes doivent êtres testées
