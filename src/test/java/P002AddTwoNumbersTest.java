import static org.junit.jupiter.api.Assertions.*;

class P002AddTwoNumbersTest {

    @org.junit.jupiter.api.Test
    void addTwoNumbers() {
//        verify(new int[]{1, 2, 3}, new int[]{4, 5, 9}, new int[]{5, 7, 2, 1});
//        verify(new int[]{9, 0, 2}, new int[]{9, 9, 1}, new int[]{8, 0, 4});
        verify(new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9}, new int[]{8, 9, 9, 9, 0, 0, 0, 1});
    }

    private void verify(int[] l1, int[] l2, int[] expected) {
        P002AddTwoNumbers cls = new P002AddTwoNumbers();
        P002AddTwoNumbers.ListNode n1 = buildListNode(l1);
        P002AddTwoNumbers.ListNode n2 = buildListNode(l2);
        P002AddTwoNumbers.ListNode actual = cls.addTwoNumbers(n1, n2);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual.val);
            actual = actual.next;
        }
        assertNull(actual);
    }

    private P002AddTwoNumbers.ListNode buildListNode(int[] l1) {
        P002AddTwoNumbers.ListNode head = new P002AddTwoNumbers.ListNode();
        P002AddTwoNumbers.ListNode cursor = head;

        for (int i = 0; i < l1.length; i++) {
            cursor.val = l1[i];

            if (i < l1.length - 1) {
                cursor.next = new P002AddTwoNumbers.ListNode();
                cursor = cursor.next;
            }
        }

        return head;
    }


}