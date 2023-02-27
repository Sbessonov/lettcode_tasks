package service.middle_node;

import service.ListNode;

import java.util.Objects;

public class MiddleNode {
    public ListNode solution(ListNode head) {
        int size = 0;
        ListNode node = head;
        while (Objects.nonNull(node)) {
            size++;
            node = node.next;
        }
        int middle = size / 2;
        node = head;
        while (middle-- > 0) {
            node = node.next;
        }
        return node;
    }
}