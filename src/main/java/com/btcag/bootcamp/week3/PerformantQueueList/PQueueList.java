package com.btcag.bootcamp.week3.PerformantQueueList;

public class PQueueList implements IMethods {
    public int[] queue = {-1, -1, -1, -1, -1};
    int countFront = 0;
    int countBack = 1;
    private int size = 0;

    public int firstIndex() {
        return (countFront + queue.length) % queue.length;      // + queue.length, weil countFront negativ werden kann, Ergebnis muss aber positiv sein
    }                                                          // %, um immer einen Wert zwischen 0 und queue.length zu bekommen. Stellt sicher, dass Index innerhalb des Array ist

    public int lastIndex() {
        return (countBack + queue.length) % queue.length;    // gleiches Prinzip wie firstIndex()
    }

    public boolean queueFull() {
        return size == queue.length;                        // Size zählt bei jedem Eintrag hoch, bei jedem Löschen runter
    }

    public boolean queueEmpty() {
        return size == 0;
    }


    public int[] doubleArray(int[] queue) {
        int[] newQueue = new int[queue.length * 2];

        for (int i = 0; i < newQueue.length; i++) {
            if (i < queue.length) {          // kopiert die übergebenen Werte in die neue Queue
                newQueue[i] = queue[i];
            } else {
                newQueue[i] = -1;       // Legt Standardwert für alle neuen Indizes fest
            }
        }
        return newQueue;
    }

    @Override
    public int popFirst() {
        if (queueEmpty()) {
            System.out.println("Queue is empty");
        }

        int temp = queue[firstIndex()];
        queue[firstIndex()] = -1;               // Werte Standardmäßig auf -1, damit Eintragung von 0 möglich ist, jedoch keine nicht belegten Indizes ausgegeben werden
        countFront = (countFront + 1) % queue.length;   //  % queue.length, damit wieder auf "0" zurückgesprungen wird, sollte countFront >= queue.length, Array aber nicht vol lsein
        size--;
        return temp;
    }

    @Override
    public int popLast() {
        if (queueEmpty()) {
            System.out.println("Queue is empty");
        }

        countBack = (countBack - 1 + queue.length) % queue.length;  // gleiches Prinzip wie bei popFirst()
        int temp = queue[lastIndex()];
        queue[lastIndex()] = -1;
        size--;
        return temp;
    }


    @Override
    public int pushLast(int i) {
        if (queueFull()) {
            queue = doubleArray(queue);
            countFront = 0;
            countBack = size;
        }

        queue[lastIndex()] = i;
        countBack = (countBack + 1) % queue.length;
        size++;
        return i;
    }

    @Override
    public int pushFirst(int i) {
        if (queueFull()) {
            queue = doubleArray(queue);
            countFront = 0;
            countBack = size;
        }

        countFront = (countFront - 1 + queue.length) % queue.length;
        queue[firstIndex()] = i;
        size++;
        return i;
    }


    @Override
    public int getObject(int i) {
        if (i < 0 || i > size) {
            System.out.println("Invalid index");
        } else {
            int uiIndex = (firstIndex() + i - 1) % queue.length;
            return queue[uiIndex];
        }
        return 0;
    }

    public void printQueue() {
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] != -1) {
                System.out.print(queue[i] + ", ");
            }
        }
        System.out.println();
    }

    public PQueueList() {
    }
}
