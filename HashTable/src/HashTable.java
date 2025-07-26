import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashTable {
    public int size = 7;
    public Node[] dataMap;

    class Node {
        String key;
        int value;
        Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    private int hashMethod(String key) {
        int hash = 0;
        char[] chars = key.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int asciivalue = chars[i];
            hash = (hash + asciivalue * 23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int index = hashMethod(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        }else{
            Node temp = dataMap[index];
            while(temp.next !=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }

    public int get(String key){
        int index = hashMethod(key);
        Node temp = dataMap[index];
            while(temp != null){
                if(temp.key == key) return temp.value;
                temp = temp.next;
            }
        return 0;
    }

    public ArrayList keys(){
        ArrayList<String> allArray = new ArrayList();
        for(int i =0;i<dataMap.length;i++){
            Node temp = dataMap[i];
            while(temp != null){
                allArray.add(temp.key);
                temp = temp.next;
            }
        }
        return  allArray;
    }

    public static boolean intCommonItem(int [] array1, int [] array2){
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for(int i: array1){
            hashMap.put(i,true);
        }
        for(int j: array2){
            if(hashMap.get(j) != null) return true;
        }
        return false;
    }
}