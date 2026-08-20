public class reverseCLL {

     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
     public static ListNode reverse(ListNode head){

         if(head.next == null) return head;
         ListNode a = head;
         ListNode b = head.next;
         ListNode c = head.next.next;

         a.next = null;
        while(c!=head){

            b.next = a;
            a = b;
            b = c;
            c = c.next;
        }
        b.next = a;
        head = b;
        c.next = head;
        return head;
     }

    public static void print(ListNode head){

        ListNode temp = head;
        do {
            System.out.print(temp.val+" --> ");
            temp = temp.next;
        } while(temp!=head);
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
//        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;
//        l5.next = l1;
//        l5.next = l6;
//        l6.next = l7;
//        l7.next = l8;
//        l8.next = l9;
        print(reverse(l1));
    }
}
