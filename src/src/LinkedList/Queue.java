package src.LinkedList;

public class Queue extends LinkedList {

    // constructor method
    public Queue() {
    }

    public void enqueue(int d)
    {
        // use LinkedList.addFirst(data d)
        addFirst(d);
    }

    public Node dequeue()
    {
        Node current;

        if (head == null) {
            return null;
        }

        current = head;
        head = head.next;
        counter--;

        return current;
    }

    public boolean isEmpty(){
        return counter == 0;
    }
}
