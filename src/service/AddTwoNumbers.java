package service;

import java.util.Objects;
import java.util.Optional;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int memory = 0;
        ListNode result = new ListNode();
        ListNode head = result;

        while (l1 != null || l2!= null || memory > 0){
            int l1Val = Objects.isNull(l1)? 0: l1.val;
            int l2Val = Objects.isNull(l2)? 0: l2.val;
            int sum = l1Val + l2Val + memory;
            result.val = sum % 10;
            memory = sum / 10;

            l1 =Objects.isNull(l1)? null: l1.next;
            l2 = Objects.isNull(l2)? null: l2.next;
            if(l1 != null || l2 != null || memory > 0){
                result.next = new ListNode();
                result = result.next;
            }

        }

        return result;
    }
}
