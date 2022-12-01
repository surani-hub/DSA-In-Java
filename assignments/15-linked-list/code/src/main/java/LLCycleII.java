import java.util.HashSet;

public class LLCycleII {
    private class Node{
        private int val;
        private Node next;

        Node(int val){
            this.val = val;
        }

        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    // SC: O(1)
    public Node detectCycle(Node head) {
        if(head == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    // Tc: O(n) SC: O(n)
    public Node detectCycleBasic(Node head) {
        HashSet<Integer> set = new HashSet<>();
        if(head == null){
            return null;
        }
        Node temp = head;

        while(temp != null){
            if(set.contains(temp.val)){
                return temp;
            }
            set.add(temp.val);
            temp = temp.next;
        }
        return null;
    }
}
