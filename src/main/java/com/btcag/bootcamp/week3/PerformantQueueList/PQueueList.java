package com.btcag.bootcamp.week3.PerformantQueueList;

public class PQueueList implements IMethods {
    public int[] queue = new int[5];
    int countFrontPops = 0;
    int countBackPops = 1;

    public int firstIndex() {
        while (countFrontPops > queue.length) {
            countFrontPops -= queue.length;
        }

        while (countFrontPops < 0) {
            countFrontPops += queue.length;
        }
        return countFrontPops;
    }

    public int lastIndex() {
        while (countBackPops > queue.length) {
            countBackPops -= queue.length;
        }
        while (countBackPops < 0) {
            countBackPops += queue.length;
        }
        return countBackPops;
    }

    public boolean queueFull() {
        return firstIndex() == lastIndex();
    }

    public int[] doubleArray(int[] newQueue) {
        int[] temp = new int[newQueue.length * 2];
        int i = 0;

        for (int j = firstIndex(); j < queue.length; j++) {
            temp[i++] = queue[j];
        }

        for (int j = 0; j < lastIndex(); j++) {
            temp[i++] = queue[j];
        }
        return temp;
    }

    @Override
    public int popFirst() {
        int temp = -1;
        if (queue[firstIndex()] != 0) {
            temp = queue[firstIndex()];
            queue[firstIndex()] = 0;
            countFrontPops++;
        }
        return temp;
    }

    @Override
    public int popLast() {
        int temp = -1;
        if (queue[lastIndex()] != 0) {
            temp = queue[lastIndex()];
            queue[lastIndex()] = 0;
            countBackPops--;
        }
        return temp;
    }

    @Override
    public int pushLast(int i) {
        if (queueFull()) {
            queue = doubleArray(queue);
        }
        queue[lastIndex()] = i;
        countBackPops++;
        return i;
    }

    @Override
    public int pushFirst(int i) {
        if (queueFull()) {
            queue = doubleArray(queue);
        }

        queue[firstIndex()] = i;
        countFrontPops--;
        return i;
    }

    @Override
    public int getObject(int i) {
        return queue[i];
    }

    public int[] printQueue() {
        return queue;
    }

    public PQueueList() {
    }
}
