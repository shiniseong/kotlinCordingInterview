class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map  = mutableMapOf<Int,Int>()
        nums.forEachIndexed { index, num ->
            val num2 = target - num
            if (num2 in map.keys) return intArrayOf(index, map[num2]!!)
            map[num2] = index
        }
        return intArrayOf(0, 0)
    }
}
fun main() {
    println("Hello World!")
}