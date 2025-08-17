public class FindLongestString {
    public static String longestStringArray(String [] stringList){
        String longestString = "";
        for(String str:stringList){
        if(str.length()>longestString.length()){
            longestString = str;
        }
        }
        return longestString;
    }

    public static void main(String[] args) {
        String[] stringList1 = {"apple", "banana", "kiwi", "pear"};
        System.out.println(longestStringArray(stringList1));
    }
}