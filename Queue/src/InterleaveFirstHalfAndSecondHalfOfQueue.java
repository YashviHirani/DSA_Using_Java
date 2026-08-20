import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static void rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue<Integer> q1 = new LinkedList();
        int size1 = q.size();
        int size2 = size1/2;

        for(int i = 0; i<size2; i++){
            q1.add(q.remove());
        }
        // q = 6 7 8 1 5
        // q1 = 2 3 4
        for(int i = 0; i<size2; i++){
            q.add(q1.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(2);
        q1.add(4);
        q1.add(3);
        q1.add(1);
//        q1.add(5);
//        q1.add(6);
//        q1.add(7);
//        q1.add(8);
//        q1.add(9);
//        q1.add(10);
        rearrangeQueue(q1);
        System.out.println(q1);
    }
}
