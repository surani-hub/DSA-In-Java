import org.w3c.dom.Node;

/* https://leetcode.com/problems/middle-of-the-linked-list/description/ */
public class MiddleLL {

    private class Node {
        private int val;
        private Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node middleNode(Node head) {
            if (head == null || head.next == null) {
                return head;
            }
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
}