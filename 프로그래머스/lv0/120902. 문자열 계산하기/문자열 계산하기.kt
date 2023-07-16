class Solution {
    fun solution(my_string: String): Int {
        val my_stringList: List<String> = my_string.split(" ")
        var answer: Int = my_stringList[0].toInt()
        
        for (i in 1 until my_stringList.size step 2) {
            val tempOperator = my_stringList[i]
            val operand = my_stringList[i + 1].toInt()
            
            if (tempOperator == "+") {
                answer += operand
            } else {
                answer -= operand
            }
        }
        
        return answer
    }
}
