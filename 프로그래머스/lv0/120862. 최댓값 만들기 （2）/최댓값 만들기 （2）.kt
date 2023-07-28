class Solution {
    fun solution(numbers: IntArray): Int {
        var max1 = Int.MIN_VALUE
        var max2 = Int.MIN_VALUE
        var min1 = Int.MAX_VALUE
        var min2 = Int.MAX_VALUE

        for (number in numbers) {
            if (number >= max1) {
                max2 = max1
                max1 = number
            } else if (number >= max2) {
                max2 = number
            }

            if (number <= min1) {
                min2 = min1
                min1 = number
            } else if (number <= min2) {
                min2 = number
            }
        }

        val maxProduct = max1 * max2
        val minProduct = min1 * min2

        return maxOf(maxProduct, minProduct)
    }
}
