public class B206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode currNode = head;
        ListNode result = null;
        while (currNode != null) {
            ListNode newNode = new ListNode(currNode.val);
            newNode.next = result;
            result = newNode;
            currNode = currNode.next;
        }
        return result;
    }
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
}
