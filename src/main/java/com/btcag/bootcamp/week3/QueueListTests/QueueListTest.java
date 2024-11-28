package com.btcag.bootcamp.week3.QueueListTests;

import com.btcag.bootcamp.week3.PerformantQueueList.PQueueList;
import com.btcag.bootcamp.week3.QueueList.QueueList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueListTest {
    QueueList list = new QueueList();
    PQueueList pList = new PQueueList();

    @org.junit.Test
    public void popFront() {
         // Queuelist
        list.pushFirst(1);
        list.pushFirst(2);
        list.pushLast(3);

        // Performant Queuelist
        pList.pushFirst(1);
        pList.pushFirst(2);
        pList.pushFirst(3);

        // Queuelist
        assertEquals(2, list.popFirst());
        assertEquals(1, list.popFirst());
        assertEquals(3, list.popFirst());
        assertEquals(-1, list.popFirst());

        // Performant Queuelist
        assertEquals(2, pList.popFirst());
        assertEquals(1, pList.popFirst());
        assertEquals(3, pList.popFirst());
        assertEquals(-1, pList.popFirst());
    }

    @Test
    public void testPopLast() {
        // Queuelist
        list.pushLast(1);
        list.pushLast(2);
        list.pushLast(3);

        // Performant Queuelist
        pList.pushLast(1);
        pList.pushLast(2);
        pList.pushLast(3);

        // Queuelist
        assertEquals(3, list.popLast());
        assertEquals(2, list.popLast());
        assertEquals(1, list.popLast());
        assertEquals(-1, list.popLast());

        // Performant Queuelist
        assertEquals(3, pList.popLast());
        assertEquals(2, pList.popLast());
        assertEquals(1, pList.popLast());
        assertEquals(-1, pList.popLast());
    }

    @Test
    public void testPushFirst() {
        // Queuelist
        assertEquals(1, list.pushFirst(1));
        assertEquals(2, list.pushFirst(2));
        assertEquals(3, list.pushFirst(3));

        // Performant Queuelist
        assertEquals(1, pList.pushFirst(1));
        assertEquals(2, pList.pushFirst(2));
        assertEquals(3, pList.pushFirst(3));
    }

    @Test
    public void testPushLast() {
        // Queuelist
        assertEquals(1, list.pushLast(1));
        assertEquals(2, list.pushLast(2));
        assertEquals(3, list.pushLast(3));

        // Performant Queuelist
        assertEquals(1, pList.pushLast(1));
        assertEquals(2, pList.pushLast(2));
        assertEquals(3, pList.pushLast(3));
    }

    @Test
    public void testGetObject() {
        // Queuelist
        list.pushLast(1); // index 0
        list.pushLast(2); // index 1
        list.pushLast(3); // index 2
        list.pushLast(4); // index 3
        list.pushLast(5); // index 4
        list.pushLast(6); // index 5
        list.pushLast(7); // index 6
        list.pushLast(8); // index 7
        list.pushLast(9); // index 8

        // Performant Queuelist
        pList.pushLast(1); // index 0
        pList.pushLast(2); // index 1
        pList.pushLast(3); // index 2
        pList.pushLast(4); // index 3
        pList.pushLast(5); // index 4
        pList.pushLast(6); // index 5
        pList.pushLast(7); // index 6
        pList.pushLast(8); // index 7
        pList.pushLast(9); // index 8

        // Queuelist
        assertEquals(1, list.getObject(0));
        assertEquals(2, list.getObject(1));
        assertEquals(3, list.getObject(2));
        assertEquals(4, list.getObject(3));
        assertEquals(5, list.getObject(4));
        assertEquals(6, list.getObject(5));
        assertEquals(7, list.getObject(6));
        assertEquals(8, list.getObject(7));
        assertEquals(9, list.getObject(8));
        assertEquals(0, list.getObject(9));

        // Performant Queuelist
        assertEquals(1, pList.getObject(0));
        assertEquals(2, pList.getObject(1));
        assertEquals(3, pList.getObject(2));
        assertEquals(4, pList.getObject(3));
        assertEquals(5, pList.getObject(4));
        assertEquals(6, pList.getObject(5));
        assertEquals(7, pList.getObject(6));
        assertEquals(8, pList.getObject(7));
        assertEquals(9, pList.getObject(8));
        assertEquals(0, pList.getObject(9));
    }
}
