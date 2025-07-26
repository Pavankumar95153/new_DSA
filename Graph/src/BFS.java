import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private int data;//number of vertex
    private ArrayList<Integer> adj[];
    private Queue<Integer> queue;
    BFS(int value){
        data = value;
        adj = new ArrayList[data];
        for(int i = 0; i<adj.length;i++){
            adj[i] = new ArrayList<>();
        }
        queue = new LinkedList<Integer>();
    }

     void addEdge(int v, int w){
        adj[v].add(w);
    }

    void BFSSearch(int v){
        boolean nodes[] = new boolean[data];
        int a = 0;
        nodes[v] = true;
        queue.add(v);
        while(queue.size() != 0){
            v = queue.poll();
            System.out.print(v +" ");
            for(int i =0; i<adj[v].size();i++){
                a = adj[v].get(i);
                if(!nodes[a]){
                    nodes[a] = true;
                    queue.add(a);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS vertex = new BFS(6);
        vertex.addEdge(0, 1);
        vertex.addEdge(0, 3);
        vertex.addEdge(0, 4);
        vertex.addEdge(4, 5);
        vertex.addEdge(3, 5);
        vertex.addEdge(1, 2);
        vertex.addEdge(1, 0);
        vertex.addEdge(2, 1);
        vertex.addEdge(4, 1);
        vertex.addEdge(3, 1);
        vertex.addEdge(5, 4);
        vertex.addEdge(5, 3);

        vertex.BFSSearch(0);
    }

}