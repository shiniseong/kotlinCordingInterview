package `trapping_rain_water_42`

class Solution {
    fun trap(height: IntArray): Int {
        var start = 0
        var end = height.size - 1
        var waterHeight = 0
        var result = 0
        var cachedStart = 0
        var cachedEnd = 0

        while (start <= end) {
            val first = height[start]
            val second = height[end]
            val tempHeight = minOf(first, second)
            waterHeight = maxOf(tempHeight, waterHeight)
            val gapFirst = if (cachedStart != start && cachedEnd != start) (waterHeight - first).coerceAtLeast(0) else 0
            val gapSecond = if (cachedEnd != end && cachedStart != end) (waterHeight - second).coerceAtLeast(0) else 0
            result += if (start == end) gapFirst else gapFirst + gapSecond
            println("first: $first, second: $second, waterHeight: $waterHeight, result: $result")
            println("start: $start, end: $end")
            println("------------------------------------------------")

            cachedStart = start
            cachedEnd = end

            if (first <= second) start += 1
            if (first >= second) end -= 1

        }
        return result
    }
}

fun main() {
    val data = intArrayOf(4, 2, 0, 3, 2, 5)
    val data2 = intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
    val data3 = intArrayOf(2, 1, 0, 2)
    val data4 = intArrayOf(6, 5, 6, 9, 6, 4, 7, 9, 6)

    println(Solution().trap(data4))
}