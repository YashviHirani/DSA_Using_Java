public class reverseLL {
    class ListNode {
        int data;
        ListNode next;

        ListNode(int x) {
            data = x;
            next = null;
        }
    }
    ListNode reverseList(ListNode head) {

        if(head.next == null) return head;
        ListNode a = head;
        ListNode b = head.next;
        ListNode c = head.next.next;

        a.next = null;
        while (b!=null){
            b.next = a;
            a = b;
            b = c;
            if(c!=null) c = c.next;
        }
        return a;
    }
}
