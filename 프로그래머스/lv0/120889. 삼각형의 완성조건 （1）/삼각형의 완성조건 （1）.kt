class Solution {
    fun solution(sides: IntArray): Int {
        val maxSide = sides.maxOrNull() ?: 0
        return if (sides.sum() - maxSide * 2 > 0) 1 else 2
    }
}
