package p_13_palindrome_linked_list

import java.util.*

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    companion object {
        fun from(vararg values: Int): ListNode? {
            if (values.isEmpty()) return null

            val head = ListNode(values.first())
            var current = head

            values.drop(1).forEach { value ->
                current.next = ListNode(value)
                current = current.next!!
            }

            return head
        }
    }
}

fun List<Int>.toLinkedList(): ListNode? =
    ListNode.from(*this.toIntArray())


class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        tailrec fun isPal(values: Deque<Int>): Boolean {
            if (values.size == 0 || values.size == 1) return true
            if (values.pollFirst() != values.pollLast()) return false
            return isPal(values)
        }

        val values: Deque<Int> = LinkedList()
        var current = head

        while (current != null) {
            values.add(current.`val`)
            current = current.next
        }

        return isPal(values)
    }
}