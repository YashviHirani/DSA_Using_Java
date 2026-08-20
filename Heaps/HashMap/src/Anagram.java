import java.util.HashMap;

public class Anagram {
    public static boolean areAnagrams(String s1, String s2) {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        for(char i : s1.toCharArray()){
            if(hm1.containsKey(i)){
                int val = hm1.get(i);
                hm1.put(i,val+1);
                // hm1.compute(i, (k, val) -> val + 1);
            }
            else hm1.put(i,1);
        }

        for(char i : s2.toCharArray()){
            if(!hm1.containsKey(i)) return false;
            else{
                int val = hm1.get(i);
                if(val==0) return false;
                else hm1.put(i,--val);
            }
        }
        for(char i : hm1.keySet()){
            if(hm1.get(i)!=0) return false;
        }
        return true;
    }
}
