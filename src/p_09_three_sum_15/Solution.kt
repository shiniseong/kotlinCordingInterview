package p_09_three_sum_15

import java.util.*

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        Arrays.sort(nums)
        val result = mutableListOf<List<Int>>()
        for (i in 0..nums.size - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) continue

            var left = i + 1
            var right = nums.size - 1

            while (left < right) {
                val sum = nums[i] + nums[left] + nums[right]
                if (sum < 0)
                    left++
                else if (sum > 0)
                    right--
                else {
                    result.add(listOf(nums[i], nums[left], nums[right]))
                    while (left < right && nums[left] == nums[left + 1]) left++
                    while (left < right && nums[right] == nums[right - 1]) right--

                    left++
                    right--
                }
            }
        }
        return result
    }
}