import java.util.ArrayList;
import java.util.Stack;

public class stockSpanProblem {
    public static ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st1 = new Stack<>();

        for(int i = 0; i<arr.length; i++) {
            while (!st1.isEmpty() && arr[i] >= st1.peek()) st1.pop();
            if(st1.isEmpty()) ans.add(i+1);
            else ans.add(arr[i]-arr[st1.peek()]);
            st1.push(arr[i]);
        }
        return ans;
     }
    public static void main(String[] args) {
        System.out.println(calculateSpan(new int[]{100,80,60,70,60,75,85}));
    }
}
