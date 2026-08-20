
public class reorderList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void reorderList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverseLL(head2);
        mergeTwoLL(head,head2);
    }
    ListNode reverseLL(ListNode head){

        if (head.next == null) return head;
        ListNode a = head;
        ListNode b = head.next;
        ListNode c = head.next.next;

        a.next = null;
        while (b != null) {
            b.next = a;
            a = b;
            b = c;
            if (c != null) c = c.next;
        }
        return a;
    }
    public ListNode mergeTwoLL(ListNode head1, ListNode head2){

        ListNode temp;
        ListNode i = head1;
        ListNode j = head2;
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        // 1 2
        // i
        // 4 3
        // j
        while(i!=null && j!=null){
        dummy.next = i;
        dummy = dummy.next;
        i = i.next;
        dummy.next = j;
        j = j.next;
        dummy = dummy.next;
        }
        if(j!=null) dummy.next = j;
        if(i!=null) dummy.next = i;
        return ans.next;
    }
}
