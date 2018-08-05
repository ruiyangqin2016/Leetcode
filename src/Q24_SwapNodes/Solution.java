package Q24_SwapNodes;

public class Solution {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode ret = new ListNode(0);

        ListNode temp = head.next;
        while (head != null) {
//            ListNode temp = head.next;
            head.next = head.next.next;
            temp.next = head;
            head = head.next;
            ret.next = temp;
//            ret = ret.next;
        }

        return ret.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);

        swapPairs(a);


    }
}
