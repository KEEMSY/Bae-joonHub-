import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        val sqrt = sqrt(n.toFloat())
        return if (sqrt == sqrt.toInt().toFloat()) 1 else 2
    }
}
