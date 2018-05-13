package src.LinkedList;

public class Queue extends LinkedList {
    Node head, tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public void enqueue(int key)
    {
        AddFirst(key);
    }

    public void deque()
    {
    }
}
