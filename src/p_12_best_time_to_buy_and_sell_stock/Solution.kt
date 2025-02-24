package p_12_best_time_to_buy_and_sell_stock

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var minPrice = prices.first()

        prices.forEach { price ->
            minPrice = price.coerceAtMost(minPrice)
            maxProfit = maxProfit.coerceAtLeast(price - minPrice)
        }

        return maxProfit
    }
}