class Solution {
    fun solution(my_string: String): Int {
        var answer = 0
        var currentNumber = 0

        for (char in my_string) {
            if (char.isDigit()) {
                currentNumber = currentNumber * 10 + char.toString().toInt()

            } else {
                answer += currentNumber
                currentNumber = 0
            }
        }

        answer += currentNumber

        return answer
    }
}
