package LinlkedList;

public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode Reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode newNode = Reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }

}
