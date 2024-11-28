package com.btcag.bootcamp.week3.QueueList;

public class QueueList implements IMethods{
    int list[] = new int[5];

    @Override
    public int popFirst() {
        int temp = -1;//ersten Wert zwischenspeichern
        if (list[0] != 0) {
            temp = list[0];
            for (int i = 0; i < list.length - 1; i++) {     //alle Werte um einen Platz nach vorne schieben
                list[i] = list[i + 1];
            }
        }

        return temp;
    }

    @Override
    public int popLast() {
        int temp = -1;
        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] != 0) {
                temp = list[i];
                list[i] = 0;
                break;
            }
        }

        return temp;
    }

    @Override
    public int pushLast(int i) {
        if (list[list.length - 1] != 0) {
            list = doubleArrayLenght(list);
        }
        for (int j = list.length - 1; j >= 0; j--) {
            if (list[j] != 0) {
                list[j + 1] = i;

                return i;
            } else if (j == 0 && list[j] == 0) {
                list[j] = i;

                return i;

            }

        }

        return -1;
    }

    @Override
    public int pushFirst(int i) {
        int temp = -1;
        if (list[list.length - 1] != 0) {
            list = doubleArrayLenght(list);
        }
        if (list[0] != 0) {
            for (int j = list.length - 2; j >= 0; j--) {
                list[j + 1] = list[j];
            }
        }
        list[0] = i;
        if (list[0] != 0) {
            temp = list[0];
        }

        return temp;
    }

    @Override
    public int getObject(int i) {

        return list[i];
    }


    private int[] doubleArrayLenght(int[] array2Copy) {
        int[] temp = new int[array2Copy.length * 2];
        for (int i = 0; i < array2Copy.length; i++) {
            temp[i] = array2Copy[i];
        }
        return temp;
    }

    public void printQueue() {
        System.out.println();
        System.out.println("Queue List");

        for (int i = 0; i < list.length; i++) {
            if(list[i] != 0) {
                System.out.print(list[i] + " ");
            }else if (list[0]==0){
                System.out.println("Die Queue List ist leer.");
                break;
            }else{
                break;
            }

        }

    }
}
