class Solution {
    fun solution(num: Int, k: Int): Int {
        val numStr = num.toString()
        val index = numStr.indexOf(k.toString())
        return if (index >= 0) index + 1 else -1
    }
}
