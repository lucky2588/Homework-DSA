public class B21 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n4.next = n5;
        n5.next = n6;
        n1 = mergeTwoLists(n1, n4);
        Print(n1);
    }
    public static class ListNode {
        public int val;
        public ListNode next;

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


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode temp = ans;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            } else {
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            temp.next = list1;
            temp = temp.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            temp.next = list2;
            temp = temp.next;
            list2 = list2.next;
        }
        return ans.next;
    }

    // Hàm in
    public static void Print(ListNode n1) {
        ListNode Curr = n1;
        while (Curr != null) {
            System.out.print(Curr.val);
            Curr = Curr.next;
            if (Curr != null) System.out.print("-->");
        }
    }


}
