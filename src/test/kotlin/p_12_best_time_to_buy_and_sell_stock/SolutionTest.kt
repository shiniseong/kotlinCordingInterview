package p_12_best_time_to_buy_and_sell_stock

import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun case1() {
        val prices = intArrayOf(7, 1, 5, 3, 6, 4)
        val result = solution.maxProfit(prices)
        assert(result == 5)
    }

    @Test
    fun case2() {
        val prices = intArrayOf(7, 6, 4, 3, 1)
        val result = solution.maxProfit(prices)
        assert(result == 0)
    }

    @Test
    fun case3() {
        val prices = intArrayOf(1, 2)
        val result = solution.maxProfit(prices)
        assert(result == 1)
    }
}