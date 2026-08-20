public class palindromeLinkedList {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int d) {
            val = d;
            next = null;
        }
    }
    public boolean isPalindrome(ListNode head) {
        // code here
        if(head.next==null) return true;
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverseLL(head2);

        while(head!=null && head2!=null){
            if(head.val !=head2.val) return false;
            head = head.next;
            head2 = head2.next;
        }
        return true;
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
}
