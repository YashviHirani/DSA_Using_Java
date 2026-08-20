public class swappingKthNodesFromEnd_L1721 {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public ListNode swapNodes(ListNode head, int k) {

          ListNode slow = head;
          ListNode fast = head;
          int i = 0;
          int j = size(head) - k + 1;
          int compareJ = k-1;

          while(fast!=null && fast.next!=null){
//              if (i)
          }
    }
    public int size(ListNode head){
          int count = 0;
          ListNode temp = head;
          while (temp!=null){
              count++;
              temp = temp.next;
          }
          return count;
    }
}
