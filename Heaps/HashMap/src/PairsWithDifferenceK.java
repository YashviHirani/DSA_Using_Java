import java.util.HashMap;

public class PairsWithDifferenceK {
    int countPairs(int[] arr, int k) {

        HashMap<Integer,Integer> hm1 = new HashMap<>();
        for(int i : arr){
            if(hm1.containsKey(i)){
                int val = hm1.get(i);
                hm1.put(i,val+1);
            }
            else hm1.put(i,1);
        }
        int ans = 0;
        int val1 = 0;
        int val2 = 0;
        for (int i : hm1.keySet()) {
            val1 = hm1.get(i);
            if (hm1.containsKey(i + k)) {
                val2 = hm1.get(i + k);
                ans += (val1*val2);
            }
            if(k==0){
                ans += ((val1*(val1-1))/2);
            }
        }
        return ans;
    }
//    public static void main(String[] args) {
//        System.out.println(countPairs(new int[]{1,4,1,4,5},3));
//    }
}
