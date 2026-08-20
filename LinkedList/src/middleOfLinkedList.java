//public class middleOfLinkedList {
//
//    class Node {
//        int data;
//        Node next;
//
//        Node(int x) {
//            data = x;
//            next = null;
//        }
//    }
//
//    public static int getMiddle(Node head) {
//        // code here
//        Node slow = head;
//        Node fast = head;
//
//        while(fast!=null && fast.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow.data;
//    }
//    public static void main(String[] args) {
//
//    }
//}
