public class removeNthNodeFromEndOfList {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {

          // 1,2,3,4,5   |   k=2
          //     s   f
        ListNode slow = head;
        ListNode fast = head;
        int temp = n;
        while(fast!=null && temp>0){
            fast = fast.next;
            temp--;
        }
        if(temp!=0) return null;
        if(fast!=null) {
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            if(slow!=null && slow.next!=null) slow.next = slow.next.next;
            return head;
        }
        else {
            head = head.next;
            return head;
        }
    }
}
