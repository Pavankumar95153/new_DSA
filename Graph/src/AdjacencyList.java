import java.util.ArrayList;
import java.util.List;

class AdjacencyGraph{
    public static void addEdge(List<List<Integer>>arr,int i,int j){
        arr.get(i).add(j);
        arr.get(j).add(i);
    }
    public static void display(List<List<Integer>>arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(i+":");
            for(int j: arr.get(i)){
                System.out.print(j+"->");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int v = 4;
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0;i<v;i++){
            arr.add(new ArrayList<>());
        }
        addEdge(arr,0,1);
        addEdge(arr,0,2);
        addEdge(arr,1,2);
        addEdge(arr,2,3);
        display(arr);
    }
}