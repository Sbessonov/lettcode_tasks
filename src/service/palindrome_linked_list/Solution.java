package service.palindrome_linked_list;

import service.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        int size = Objects.nonNull(head) ? 1 : 0;
        ListNode node = head.next;
        while (Objects.nonNull(node)) {
            size++;
            node = node.next;
        }
        int half = size / 2;

        ListNode secondIterator = head;
        List<Integer> firstHalf = new ArrayList<>();

        for (int i = 0; i < half; i++) {
            firstHalf.add(secondIterator.val);
            secondIterator = secondIterator.next;
        }
        secondIterator = size % 2 != 0 ? secondIterator.next : secondIterator;

        while (half > 0 && firstHalf.get(half-1).equals(secondIterator.val)) {
            secondIterator = secondIterator.next;
            half--;
        }

        return half == 0;
    }
}