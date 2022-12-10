public class AddNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = l1;
        ListNode list2 = l2;
        ListNode ans = new ListNode(0);
        ListNode curr = ans;

        int carry = 0;
        while (list1 != null || list2 != null) {
            int x = (list1 != null) ? list1.val : 0;
            int y = (list2 != null) ? list2.val : 0;
            int sum = carry + x + y;
            curr.next = new ListNode(sum % 10);
            carry = sum / 10;
            curr = curr.next;

            if (list1 != null)
                list1 = list1.next;
            if (list2 != null)
                list2 = list2.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return ans.next;
    }

    private class ListNode {
        private int val;
        private ListNode next;

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
