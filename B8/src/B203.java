public class B203 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        PrintListNode(n1);
        System.out.println("Remove , Excise 4 ");
        n1 = removeElements(n1,4);
        System.out.println("");
        PrintListNode(n1);

    }

    public static void PrintListNode(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
            if (node != null) System.out.print("-->");
        }
    }

    public static class ListNode {
        public int val;
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

    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode CurrNode = head;
        while (CurrNode != null && CurrNode.next != null) {
            if (CurrNode.next.val == val) {
                CurrNode.next = CurrNode.next.next;
            } else {
                CurrNode = CurrNode.next;
            }
        }
        return head;
    }
}
