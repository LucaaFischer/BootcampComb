package com.btcag.bootcamp.week3.PerformantQueueList;

public class PQueueList implements IMethods {
    public int[] queue = new int[5];
    int countPops = 0;

    public int firstIndex() {
        while (countPops > queue.length - 1) {
            countPops -= queue.length;
        }
        while (countPops < 0) {
            countPops += queue.length;
        }
        return countPops;
    }

    public int lastIndex() {
        int lastIndex = firstIndex();
        for (int i = queue.length; i > 0; i--) {
            lastIndex++;
            if (lastIndex > queue.length) {
                lastIndex -= queue.length;
            }
        }
        return lastIndex;
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

    public int popFirst() {
        queue[firstIndex()] = -1;
        countPops++;
        return firstIndex();
    }

    public int popLast() {
        queue[lastIndex()] = -1;
        countPops++;
        return lastIndex();
    }

    public int pushLast(int i) {
        if (lastIndex() != 0) {
            queue = doubleArray(queue);
        }
        for (int j = firstIndex(); j < queue.length; j++) {
            if (queue[j] == 0) {
                queue[j] = i;
                return i;
            }
        }

        for (int j = 0; j < lastIndex(); j++) {
            if (queue[j] == 0) {
                queue[j] = i;
                return i;
            }
        }
        return -1;
    }

    public int pushFirst(int i) {
        if (lastIndex() != 0) {
            queue = doubleArray(queue);
        }
        for (int j = 0; j < firstIndex(); j++) {
            if (queue[j] == 0) {
                queue[j] = i;
                return i;
            }
        }
        for (int j = lastIndex(); j > 0; j--) {
            if (queue[j] == 0) {
                queue[j] = i;
            }
        }
        countPops--;
        return -1;
    }

    public int getObject(int i) {
        return queue[i];
    }

    public int[] printQueue() {
        return queue;
    }

    public PQueueList() {
    }
}
