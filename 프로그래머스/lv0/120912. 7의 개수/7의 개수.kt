class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        for (num in array) {
            answer += num.toString().count { it == '7' }
        }
        return answer
    }
}
