public class Queue implements Cloneable {
    private final int DEFAULT_CAPACITY = 10;
    private int front, back, count;
    private int[] m_array;

    //-----------------------------------------------------------------
    //  Creates an empty queue using the default capacity.
    //-----------------------------------------------------------------
    public Queue() {
        front = back = count = 0;
        m_array = new int[DEFAULT_CAPACITY];
    }

    //-----------------------------------------------------------------
    //  Creates an empty queue using the specified capacity.
    //-----------------------------------------------------------------
    public Queue (int initialCapacity) {
        front = back = count = 0;
        m_array = new int[initialCapacity];
    }

    //-----------------------------------------------------------------
    //  Adds the specified element to the rear of the queue, expanding
    //  the capacity of the queue array if necessary.
    //-----------------------------------------------------------------
    public void enqueue (int element) {
        if (size() == m_array.length) {
            expandCapacity();
        }

        m_array[back] = element;

        back = (back+1) % m_array.length;

        count++;
    }

    //-----------------------------------------------------------------
    //  Removes the element at the front of the queue and returns a
    //  reference to it. Throws an EmptyCollectionException if the
    //  queue is empty.
    //-----------------------------------------------------------------
    public int dequeue() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("queue");
        }

        int result = m_array[front];
        front = (front+1) % m_array.length;
        count--;

        return result;
    }

    //-----------------------------------------------------------------
    //  Returns a reference to the element at the front of the queue.
    //  The element is not removed from the queue.  Throws an
    //  EmptyCollectionException if the queue is empty.
    //-----------------------------------------------------------------
    public int front() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("queue");
        }

        return m_array[front];
    }

    //-----------------------------------------------------------------
    //  Returns true if this queue is empty and false otherwise.
    //-----------------------------------------------------------------
    public boolean isEmpty() {
        return (count == 0);
    }

    //-----------------------------------------------------------------
    //  Returns the number of elements currently in this queue.
    //-----------------------------------------------------------------
    public int size() {
        return count;
    }


    //-----------------------------------------------------------------
    //  Returns a string representation of this queue.
    //-----------------------------------------------------------------
    public String toString() {
        String result;
        StringBuilder sb = new StringBuilder();

        for(int i = front; i != back; i = (i+1)%m_array.length) {
            sb.append(String.valueOf(m_array[i]) + "\n");
        }
        result =sb.toString();

        return result;
    }

    //-----------------------------------------------------------------
    //  Creates a new array to store the contents of the queue with
    //  twice the capacity of the old one.
    //-----------------------------------------------------------------
    public void expandCapacity() {
        int[] larger = new int[m_array.length *2];

        for(int scan=0; scan < count; scan++) {
            larger[scan] = m_array[front];
            front=(front+1) % m_array.length;
        }

        front = 0;
        back = count;
        m_array = larger;
    }

    @Override
    public Object clone()throws CloneNotSupportedException {
        //return super.clone();
        Queue queueClone = new Queue(m_array.length);
        queueClone.front = front;
        queueClone.back = back;
        queueClone.count = count;
        for(int i = front; i != back; i = (i+1)%m_array.length) {
            queueClone.m_array[i] = m_array[i];
        }
        return queueClone;
    }
}