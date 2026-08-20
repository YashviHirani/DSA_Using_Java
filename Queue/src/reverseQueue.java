import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {

    static void reverseTheQueue(Queue<Integer> q){
        Stack<Integer> st1 = new Stack<>();

        while(!q.isEmpty()) st1.push(q.poll());
        while (!st1.isEmpty()) q.add(st1.pop());
    }
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        reverseTheQueue(q);
        System.out.println(q);
    }
}
