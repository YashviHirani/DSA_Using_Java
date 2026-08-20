public class swappingNodes {

    public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode swapNodes(ListNode head, int k) {

        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;

        for(int i = 1; i<k; i++){
            fast = fast.next;
        }
        temp = fast;

            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            int slow2 = temp.val;
                temp.val = slow.val;
                slow.val = slow2;
            return head;
        }


    public static void display(ListNode head){

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
        ListNode l3 = new ListNode(3);
//        ListNode l4 = new ListNode(4);
//        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;
        display(swapNodes(l1,2));
    }
}
