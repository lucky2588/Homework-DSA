public class B160 {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA ; // tạo 2 nốt Current
        ListNode b = headB ;
        while(a != null )
        {
            while( b != null )
            {
                if(a == b) // nếu tại node mà a và b trùng , nối từ đây
                    return a;
                b = b.next ; // duyệt đến B tiếp theo
            } // sau khi duyệt hết B thì nối hết đến list A
            a = a.next ;
            b = headB ; // gắn B cuối vào head B khi đã nối vào A
        }
        return null ;
        // Độ phức tạp thời gian : Duyệt từ đầu đến khi gặp giá trị trùng ==> O(N)
    }
}
