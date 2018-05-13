package src.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

//    list.Show();
//    list.AddLast(1);
//    list.Show();
//    list.AddLast(2);
//    list.Show();
//    list.AddLast(3);
//    list.Show();
//    list.Remove(1);
//    list.Show();
//    list.AddFirst(5);
//    list.Show();

        int v = 5;

        Graph graph = new Graph(v);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.show();
    }
}
