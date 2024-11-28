package com.btcag.bootcamp.week3.PerformantQueueList;

import java.util.Arrays;
import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PQueueList queuelist = new PQueueList();

        int userInput;
        int toDo = 0;

        while (toDo != 6) {
            System.out.println("Was möchtest du machen?\n" +
                    " (1) Erstes Element löschen,\n" +
                    " (2) Letztes Element löschen,\n" +
                    " (3) Objekt am Ende einfügen,\n" +
                    " (4) Objekt am Anfang hinzufügen,\n" +
                    " (5) Ein bestimmtes Element auslesen,\n" +
                    " (6) Programm beenden.\n");

            toDo = input.nextInt();

            if (toDo == 1) {
                System.out.println("Das Element " + queuelist.popFirst() + " wurde gelöscht");

            } else if (toDo == 2) {
                System.out.println("Das Element " + queuelist.popLast() + " wurde gelöscht");

            } else if (toDo == 3) {
                System.out.println("Was möchtest du hinzufügen?");
                userInput = input.nextInt();
                System.out.println("Das Objekt " + queuelist.pushLast(userInput) + " wurde der Warteschlange am Ende hinzugefügt!");

            } else if (toDo == 4) {
                System.out.println("Was möchtest du hinzufügen?");
                userInput = input.nextInt();
                System.out.println("Das Objekt " + queuelist.pushFirst(userInput) + " wurde der Warteschlange am Anfang hinzugefügt!");

            } else if (toDo == 5) {
                System.out.println("Welches Element willst du auslesen?");
                userInput = input.nextInt();
                System.out.println("Das " + userInput + " Element der Queue ist: " + queuelist.getObject(userInput));
            }

            queuelist.printQueue();
        }
    }
}
