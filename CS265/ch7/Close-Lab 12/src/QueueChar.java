/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 *
 * @author ziping
 */
public class QueueChar implements Cloneable,Iterable{
    private int mFront, mBack;
    private final char[] mArray;

    public QueueChar() {
        mFront = 0;
        mBack = 0;
        int DEFAULT_CAPACITY = 6;
        mArray = new char[DEFAULT_CAPACITY];
    }

    public QueueChar(int initCapacity) {
        mFront = 0;
        mBack = 0;
        mArray = new char[initCapacity];
    }

    /*
    add item at the back of queue, throw full queue exception if queue is full
    */
    public void enqueue(char item) {
        if((mBack + 1) % mArray.length == mFront)
            throw new FullQueueException("Queue");

        mArray[mBack] = item;
        mBack = (mBack + 1) % mArray.length;
    }

    /*
    remove item at the front of queue, throw empty queue exception if queue is empty
    */
    public void dequeue() throws EmptyQueueException {
        if (mFront == mBack)
            throw new EmptyQueueException("Queue");

        mFront = (mFront + 1) % mArray.length;
    }

    /*
    return item at the front of queue, throw empty queue exception if queue is empty
    */
    public char front() throws EmptyQueueException {
        if (mFront == mBack)
            throw new EmptyQueueException("Queue");

        return mArray[mFront];
    }

    public boolean empty() {
        return (mFront == mBack);
    }

    @Override
    public String toString()
    {
        String result;
        StringBuilder sb = new StringBuilder();

        for(int i = mFront; i != mBack; i = (i+1)% mArray.length)
            sb.append(mArray[i]).append("\n");
        result =sb.toString();

        return result;
    }

    @Override
    public Object clone(){
        QueueChar queueCharClone = new QueueChar(mArray.length);
        queueCharClone.mFront = mFront;
        queueCharClone.mBack = mBack;
        for(int i = mFront; i != mBack; i = (i+1)% mArray.length)
        {
            queueCharClone.mArray[i] = mArray[i];
        }
        return queueCharClone;
    }

    //Implementing Iterable interface allows an object to be the target
    //of the "for-each loop" statement.
    @Override
    public Iterator iterator(){
        return new queueIterator();
    }

    //Iterator interface 3 main methods: hasNext(), next(), remove()
    private class queueIterator implements Iterator{
        private int index;
        // constructor: initialize index to mFront
        queueIterator() {
            index = mFront;
        }

        // Checks if the next element exists
        public boolean hasNext() {
            return (index + 1)% mArray.length != mBack;
        }

        // Returns the next element in the queue and advances iterator by one slot
        public Character next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Character result = mArray[index];
            index = (index + 1) % mArray.length;
            return result;
        }

        // Used to remove an element. Implement only if needed
        public void remove() {
            // Default throws UnsupportedOperationException.
            throw new UnsupportedOperationException();
        }

    }
    public char back(){
        return mArray[mBack - 1];

    }
}