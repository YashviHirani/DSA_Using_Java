import java.util.HashMap;

public class LongestSubstringWithDistinctCharacters {
    static public int longestUniqueSubstr(String s) {

        HashMap<Character,Integer> hm1 = new HashMap<>();
        int i = 0;
        int size = s.length();
        int max = 0;
        while(i<size){
            hm1.put(s.charAt(i),1);
            for(int j = i+1; j<size; j++){
                if(hm1.containsKey(s.charAt(j))){
                    if(hm1.size()>max) max = hm1.size();
                    hm1 = new HashMap<>();
                    break;
                }
                else hm1.put(s.charAt(j),1);
            }
            i++;
        }
        if(hm1.size()>max) max = hm1.size();
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestUniqueSubstr("geeksforgeeks"));
    }
}
