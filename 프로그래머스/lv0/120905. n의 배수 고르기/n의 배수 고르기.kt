class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray {
        val answer = numlist.filter { it % n == 0 }.toIntArray()
        return answer
    }
}