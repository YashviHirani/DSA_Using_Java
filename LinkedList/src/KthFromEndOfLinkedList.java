public class KthFromEndOfLinkedList {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null;
        }
    }
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node slow = head;
        Node fast = head;
        int temp = k;

        do{
            fast = fast.next;
            temp--;
        }while(fast!=null && temp>=1);

        if(temp!=0) return -1;

        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
        // 10 -> 30 -> 40 -> 60
        // i
        // 20 -> 50 -> 70 -> 80 -> 90
        // j
        //
    }
}
