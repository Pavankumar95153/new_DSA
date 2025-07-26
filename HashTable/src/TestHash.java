import java.util.ArrayList;
import java.util.Objects;

public class TestHash {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.set("screw",100);
        hashTable.set("Bolt",3);
        ArrayList<String> arrayList = new ArrayList();
        for(Object s: hashTable.keys()){
            arrayList.add(s.toString());
        }
        System.out.println(arrayList);
    }

}