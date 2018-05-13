package src.LinkedList;

public class LinkedList {
    Node head;
    int counter;

    //constructor method
    public LinkedList(){
        head = new Node(0);
        counter = 0;
    }

    public void AddFirst(int d){
        Node current = new Node(d);
        current.next = head;
        counter++;
        head = current;
    }

    public void AddLast(int d){
        Node tail = new Node(d);
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = tail;
        counter++;
    }

    public Node Remove(int d){
        Node current = head;
        while (current.next != null){

            if (current.next.data == d){
                Node removed = current;
                current.next = current.next.next;
                counter--;
                return removed;
            }//end if
            current = current.next;

        }//end while

        return current;
    }

    public void Show(){
        Node current = head;
        while (current.next != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println(current.data);
    }

    public boolean deleteNodeWithData(int d){
        Node current = head;
        while(current.next!=null){
            if(current.next.data==d){
                current.next = current.next.next;
                counter--;
                System.out.println("Success! Node with data "+d+" deleted.");
                return true;
            }
            current = current.next;
        }
        System.out.println("Delete Failed: No node found with given data!");
        return false;
    }

    public boolean deleteNodeAtIndex(int index){
        Node current = head;
        int jump;
        if(index>counter || index<1){
            System.out.println("Delete Failed: index out of bounds of size of linked list!!");
            return false;
        }
        else{
            jump=0;
            while(jump<index-1){
                current = current.next;
                jump++;
            }
            current.next = current.next.next;
            System.out.println("Success! Node at index "+index+" deleted.");
            counter--;
            return true;
        }
    }
}
