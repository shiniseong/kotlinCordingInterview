package p_13_palindrome_linked_list

import kotlin.test.Test

class SolutionTest {
    @Test
    fun case1() {
        val head = listOf(1, 2, 2, 1).toLinkedList()
        val result = Solution().isPalindrome(head)
        assert(result)
    }

    @Test
    fun case2() {
        val head = listOf(1, 2).toLinkedList()
        val result = Solution().isPalindrome(head)
        assert(!result)
    }

    @Test
    fun case3() {
        val head = listOf(1, 2, 3, 2, 1).toLinkedList()
        val result = Solution().isPalindrome(head)
        assert(result)
    }

    @Test
    fun case4() {
        val head = listOf(1, 2, 3, 3, 2, 1).toLinkedList()
        val result = Solution().isPalindrome(head)
        assert(result)
    }
}