import java.util.LinkedList;
import java.util.Stack;

public class DFS {
    int v;
    LinkedList<Integer> adj[];
    DFS(int value){
        v = value;
        adj = new LinkedList[v];
        for(int i=0;i<adj.length;i++){
            adj[i]=new LinkedList<>();
        }
    }
    void addEdge(int v, int w){
        adj[v].add(w);
    }
    void DFSSearch(int n){
        boolean nodes[] = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        stack.push(n);
        int a = 0;
        while(!stack.empty())
        {
            n = stack.peek();
            stack.pop();
            if (nodes[n] == false) {
                System.out.println(n+" ");
                nodes[n]= true;
            }
            for(int i=0;i<adj[n].size();i++){
                a = adj[n].get(i);
                if(!nodes[a]){
                    stack.push(a);
                }
            }
        }
    }

    public static void main(String[] args) {
        DFS g = new DFS(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 0);
        g.addEdge(1, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 3);
        g.addEdge(5, 3);
        g.DFSSearch(0);

    }
}