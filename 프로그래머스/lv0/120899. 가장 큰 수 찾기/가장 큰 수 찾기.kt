class Solution {
    fun solution(array: IntArray): IntArray {
        val maxNumber = array.maxOrNull() ?: 0
        val maxIndex = array.indexOf(maxNumber)
        return intArrayOf(maxNumber, maxIndex)
    }
}
