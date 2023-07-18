class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = array[0]

        for (num in array) {
            if (Math.abs(num - n) < Math.abs(answer - n)) {
                answer = num
            } else if (Math.abs(num - n) == Math.abs(answer - n) && num < answer) {
                answer = num
            }
        }

        return answer
    }
}
