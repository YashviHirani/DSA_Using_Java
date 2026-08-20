import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayDuplicates {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        int i = 0;
        int lastMatched = -1;
        int size = arr.length;
        HashSet<Integer> hs1 = new HashSet<>();
        while(i<size){
            if(arr[i]==(i+1)){

                if(lastMatched==arr[i]) hs1.add(arr[i]);
                lastMatched = arr[i];
                i++;
            }
            else {
                if(arr[i] == arr[arr[i] - 1]){
                    hs1.add(arr[i]);
                    i++;
                    continue;
                }
                arr[i] = arr[arr[i]-1] + arr[i] - (arr[arr[i]-1]=arr[i]);
            }

        }
        return new ArrayList<>(hs1);
    }
}
