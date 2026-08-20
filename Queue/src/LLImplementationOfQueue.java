import java.util.LinkedList;
import java.util.Queue;

public class LLImplementationOfQueue {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static Node head;
    static Node tail;
    static Node next;

    static int size = 0;
    static void add(int val){
        Node temp = new Node(val);
        if(size==0) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    static int remove(){
        if(size==0){
            System.out.println("Queue is empty !");
            return -1;
        }
        int front = head.data;
        head = head.next;
        size--;
        return front;
    }

    static int peek(){
        if(size==0){
            System.out.println("Queue is empty !");
            return -1;
        }
        return head.data;
    }
    static void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        add(10);
        add(20);
        add(30);
        add(40);
        display();
        System.out.println(remove());
        display();
        System.out.println(peek());
    }
}
