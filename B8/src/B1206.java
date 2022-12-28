public class B1206 {
    class MyLinkedList {

        public Node mHead;
        public int size;

        public MyLinkedList() {
            mHead = null;
            size = 0;
        }

        public int get(int index) {
            Node curr = mHead;
            int idx = 0;
            while (curr != null /*&& idx < index*/) {
                if (idx == index/* && curr != null*/) {
                    return curr.val;
                }
                curr = curr.next;
                idx++;
            }
            return -1;
        }

        public void addAtHead(int val) {
            Node newNode = new Node(val);
            newNode.next = mHead;
            mHead = newNode;
            size++; // Tăng lên 1 đơn vị vì thêm ở đầu
        }

        public void addAtTail(int val) {
            if (mHead == null) {
                addAtHead(val); // trong hàm này đã có tăng 1 đơn vi cho Chiều dài Mảng LinkList rồi
                return;
            }

            Node newNode = new Node(val);
            Node curr = mHead;
            while (curr.next != null) {
                curr = curr.next;
            }
            size++;
            curr.next = newNode;

        }

        public void addAtIndex(int index, int val){
            if (index == 0) {
                addAtHead(val);
            }
            Node newNode = new Node(val);
            //Tim vi tri
            Node curr = mHead;
            int idx = 0;
            while (curr != null) {
                if (idx == index - 1) {
                    newNode.next = curr.next;
                    curr.next = newNode;
                    return;
                }
                curr = curr.next;
                idx++;

            }
            size++;
        }

        public void deleteAtIndex(int index) {
            if (index == 0) {
                mHead = mHead.next;
            }
            //Tim vi tri
            Node curr = mHead;
            int idx = 0;
            while (curr != null) {
                if (idx == index - 1) {
                    if (curr.next != null) {
                        curr.next = curr.next.next;
                    } else {
                        curr.next = null;
                    }
                }
                curr = curr.next;
                idx++;
            }
            size--;
        }

        static class Node {
            int val;
            Node next;

            public Node(int data) {
                val = data;
            }
        }
    }
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}
