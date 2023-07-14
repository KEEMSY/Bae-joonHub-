class Solution {
    fun solution(n: Int): Int {
        return n.toString().sumBy { it.toString().toInt() }
    }
}
