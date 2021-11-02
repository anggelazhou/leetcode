public class P002AddTwoNumbers {


    // Definition for singly-linked list.
    public static class ListNode {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = l1;
        ListNode n2 = l2;

        int carry = 0;
        ListNode l3 = null;

        ListNode l3Head = null;

        while (n1 != null || n2 != null) {
            int v1 = n1 == null ? 0 : n1.val;
            int v2 = n2 == null ? 0 : n2.val;

            if (l3 == null) {
                l3 = new ListNode();
                l3Head = l3;
            } else {
                l3.next = new ListNode();
                l3 = l3.next;
            }

            l3.val = v1 + v2 + carry;
            if (l3.val >= 10) {
                l3.val -= 10;
                carry = 1;
            } else {
                carry = 0;
            }

           if (n1 != null) {
               n1 = n1.next;
           }

            if (n2 != null) {
                n2 = n2.next;
            }
        }

        if (carry == 1) {
            l3.next = new ListNode();
            l3 = l3.next;
            l3.val = 1;
        }



        return l3Head;
    }
}
