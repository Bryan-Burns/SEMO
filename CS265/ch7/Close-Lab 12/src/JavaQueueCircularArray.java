import java.util.Scanner;

/*
Author:  Bryan Burns & Ziping
Date: April 10, 2022
Purpose: Test program using queues to help learn how they work.
*/
public class JavaQueueCircularArray {

    public static void main(String[] args) {
        Queue q1 = new Queue();
        System.out.println("Queue created. Empty? " + q1.empty());

        System.out.print("How many elements to add to the queue?: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i = 1; i < num + 1; i++) {
            q1.enqueue(i * 100);
        }

        System.out.println("Contents of Queue:\n" + q1);
        System.out.println("Queue Empty? " + q1.empty());

        System.out.println();
        System.out.println("Front value in q1: " + q1.front());
        System.out.println("Back value in q1: " + q1.back()); //Code to test back();

        if(searchFor300(300, q1)) {
            System.out.println("found the item 300");
        } else {
            System.out.println("item 300 not found");
        }

        if(searchFor500(500, q1)) {
            System.out.println("found the item 500");
        } else {
            System.out.println("item 500 not found");
        }

        System.out.println();
        while (!q1.empty()) {
            System.out.println("Remove front -- Queue contents: ");
            q1.dequeue();
            System.out.println(q1);
        }

        System.out.println("Queue Empty? " + q1.empty());
        System.out.println();
        System.out.println("Now try to retrieve front value in q1: ");
        try {
            System.out.println("Front value in q1: " + q1.front());
        } catch(EmptyQueueException ex) {
            System.out.println("The Queue is Empty");
        }

        System.out.println();
        System.out.println("Now Try to remove front of q1: ");
        try {
            q1.dequeue();
        } catch(EmptyQueueException ex) {
            System.out.println("The Queue is Empty");
        }
    }

    public static boolean searchFor300(int item, Queue Q) {
        Queue qCopy;
        qCopy = (Queue)Q.clone();

        while(!qCopy.empty() && qCopy.front() != item) {
            qCopy.dequeue();
        }
        return !qCopy.empty();
    }

    public static boolean searchFor500(int item, Queue Q) {
        for(Object num: Q) {
            if ((Integer) num == item) {
                return true;
            }
        }
        return false;
    }

}