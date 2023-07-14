class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        return quiz.map { problem ->
            val equation = Equation(problem)
            if (equation.isCorrect()) "O" else "X"
        }.toTypedArray()
    }
    
    class Equation(problem: String) {
        private val targetNum1: Int
        private val targetOperator: String
        private val targetNum2: Int
        private val targetResult: Int

        init {
            val parts = problem.split(" ")
            targetNum1 = parts[0].toInt()
            targetOperator = parts[1]
            targetNum2 = parts[2].toInt()
            targetResult = parts[4].toInt()
        }

        fun isCorrect(): Boolean {
            val tempSum = if (targetOperator == "+") {
                targetNum1 + targetNum2
            } else {
                targetNum1 - targetNum2
            }
            return tempSum == targetResult
        }
    }
}
