import java.util.HashMap;

public class CountEqualPairsInString {
    public int equalPairs(String s) {

        // for n number we will have (n(n-1))/2 pairs
        // as the series follows :
        // 1,2,3,4,5,6,...
        // 0,1,3,6,10,15,... ---> That is the famous sequence of triangular numbers!
        HashMap<Character,Integer> hm1 = new HashMap<>();
        for(char i : s.toCharArray()){
            if(hm1.containsKey(i)){
                int val = hm1.get(i);
                hm1.put(i,val+1);
            }
            else hm1.put(i,1);
        }
        int ans = 0;
        for(char i : hm1.keySet()){
            if(i==1) continue;
            int val = hm1.get(i);
            ans += ((val*(val-1))); // removed /2 because we need to count reverse indices also so we need to do *2 so it becomes 1
        }
        return ans+s.length();
    }
}
