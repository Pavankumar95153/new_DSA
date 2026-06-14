import java.util.HashMap;

public class LongestSubStringByWindowSliding {
    public static int getLongestSubString(String s){
        if(s == null||s.length()==0) return 0;
        int max_length =0;
        int left=0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int right =0;right<s.length();right++){
            char currentCharacter = s.charAt(right);
            // If character is a duplicate and inside current window, move left pointer
            if(map.containsKey(currentCharacter)&&map.get(currentCharacter)>= left){
                left= map.get(currentCharacter)+1;
            }
            map.put(currentCharacter,right);
            max_length = Math.max(max_length,right-left+1);

        }
        return max_length;
    }

    public static void main(String[] args) {
        System.out.println(getLongestSubString("abcdabc"));
    }
}