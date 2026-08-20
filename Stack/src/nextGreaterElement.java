import java.util.ArrayList;
import java.util.Stack;

public class nextGreaterElement {
    public static ArrayList<Integer> nextLargerElement(int[] arr) {

        // 1 8 3 5 2 1 6 4 9
        //
        ArrayList<Integer> al1 = new ArrayList<>();
        Stack<Integer> st1 = new Stack<>();

        for(int i = arr.length-1; i>=0; i--){
            if(st1.isEmpty()){
                st1.push(arr[i]);
                al1.addFirst(-1);
            }
            else {
                if (arr[i] < st1.peek()) {
                    al1.addFirst(st1.peek());
                    st1.push(arr[i]);
                } else {
                    while (!st1.isEmpty() && arr[i] >= st1.peek()) {
                        st1.pop();
                    }
                    if (st1.isEmpty()) al1.addFirst(-1);
                    else {
                        al1.addFirst(st1.peek());
                        st1.push(arr[i]);
                    }
                }
            }
        }
        return al1;
    }

    public static void main(String[] args) {
        System.out.println(nextLargerElement(new int[]{20,18,8,17,20,20,7,2,9,10,2,11,20,8}));
    }
}
