public class Main {

    public static void main(String[] args) {
        int[] array1 ={1,2,6};
        int[] array2 = {4,5,3};
        HashTable newHashTable = new HashTable();
        newHashTable.set("nails",50);
        newHashTable.set("tile",45);
        newHashTable.set("lumber",80);
        newHashTable.set("screws",140);
        int value =newHashTable.get("screws");
//        System.out.println(value);
//        System.out.println(newHashTable.keys());
        System.out.println(HashTable.intCommonItem(array1,array2));
    }
}