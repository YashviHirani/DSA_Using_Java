import java.util.HashMap;

public class ArraySubset {
    public boolean isSubset(int a[], int b[]) {


        HashMap<Integer,Integer> hm1 = new HashMap<>();

        for(int i : a){
            if(hm1.containsKey(i)){
                int val = hm1.get(i);
                hm1.put(i,val+1);
                // hm1.compute(i, (k, val) -> val + 1);
            }
            else hm1.put(i,1);
        }

        for(int i : b){
            if(!hm1.containsKey(i)) return false;
            else{
                int val = hm1.get(i);
                if(val==0) return false;
                else hm1.put(i,--val);
            }
        }
        return true;
    }
}
