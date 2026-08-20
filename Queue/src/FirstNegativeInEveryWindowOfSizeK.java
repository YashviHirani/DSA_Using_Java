import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeInEveryWindowOfSizeK {
    //    Input: arr[] = [ -7, 8, -15, 30, 16, 28 , 12, -1] , k = 3
    //    Output: [-1, -1, -7, -15, -15, 0]
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        int i = 0;
        List<Integer> l1 = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int x : arr) q.add(x);
        int size = q.size();
        int remove,s;
        int c = 0;
        while (i<size){
            if((i+k)<=size) {
                c = 0;
                remove = 0;
                for (int l = 1; l <= k; l++) {
                    remove = q.peek();
                    q.add(q.remove());
                    c++;
                    if (remove < 0) {
                        break;
                    }
                }
                if(c==k) l1.add(0);
                else l1.add(remove);
                if(c!=1) {
                    s = size - c + 1;
                    for (int l = 0; l < s; l++) q.add(q.remove());
                }

            }
            else break;
            i++;
        }
        return l1;
    }

    public static void main(String[] args) {
        System.out.println(firstNegInt(new int[]{-8, 2, 3, -6, 10},2));
    }
}
