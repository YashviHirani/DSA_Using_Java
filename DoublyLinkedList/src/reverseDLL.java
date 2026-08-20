public class reverseDLL {
    static class ListNode {
        ListNode next;
        ListNode prev;
        int val;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode reverseDoublyLL(ListNode head){

//        ListNode temp = null;
//        ListNode i = head;
//
//        while(i!=null){
//            temp = i.prev;
//            i.prev = i.next;
//            i.next = temp;
//            i = i.prev;
//        }
//        return temp != null ? temp.prev : head;

        ListNode a = head;
        ListNode b = head.next;
        a.next = null;

        while(b!=null){
           a.prev = b;
           b.prev = null;
           b = b.next;
            if (a.prev != null) {
                a.prev.next = a;
            }
            a = a.prev;
        }
        return a;
    }
    public static void print(ListNode head){

        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" --> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
//        ListNode l3 = new ListNode(3);
//        ListNode l4 = new ListNode(4);
//        ListNode l5 = new ListNode(5);
//        ListNode l6 = new ListNode(6);
//        ListNode l7 = new ListNode(7);
//        ListNode l8 = new ListNode(8);
//        ListNode l9 = new ListNode(9);

        l1.next = l2;
        l2.prev = l1;
//        l2.next = l3;
//        l3.prev = l2;
//        l3.next = l4;
//        l4.prev = l3;
//        l4.next = l5;
//        l5.prev = l4;
//        l5.next = l6;
//        l6.next = l7;
//        l7.next = l8;
//        l8.next = l9;
        print(reverseDoublyLL(l1));
    }
}
