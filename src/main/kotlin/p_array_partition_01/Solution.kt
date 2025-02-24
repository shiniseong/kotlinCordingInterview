package p_array_partition_01

class Solution {
    fun arrayPairSum(nums: IntArray): Int = nums
        .sorted()
        .chunked(2)
        .sumOf { it.first() }
}