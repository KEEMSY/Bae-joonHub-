class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        val answer = my_string.toCharArray()
        answer[num1] = answer[num2].also { answer[num2] = answer[num1] }
        
        return answer.joinToString("")
    }
}
