import java.util.Arrays;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
         String str1 = "listen";
         String str2 = "silent";

        System.out.println("is Anagram-->"+isAnagram(str1,str2));

    }

    private static boolean isAnagram(String str, String str1){
        int length_of_first_string = str.length();
        int length_of_second_string = str1.length();
        char[] chars = str.toCharArray();
        char[] chars1 = str1.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        if(chars.length != chars1.length){
            return false;
        }
        for(int i=0; i<str.length();i++){
            if(chars[i]!= chars1[i]){
                return false;
            }
        }
        return true;
    }

}