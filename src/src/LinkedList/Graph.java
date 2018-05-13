package src.LinkedList;

public class Graph {
    int vectors;
    LinkedList[] list;

    public Graph(int v){
        vectors = v;
        list = new LinkedList[v];
        for (int index = 0; index < v; index++){
            list[index]= new LinkedList();
        }
    }

    public void addEdge(int source, int destination){
        list[source].AddFirst(destination);
        list[destination].AddFirst(source);
    }

    public void show(){
        for (int v= 0; v < vectors; v++){
            System.out.println("Adjacency list of vertex " + v);
            list[v].Show();
        }
    }
}

