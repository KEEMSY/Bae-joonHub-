class Solution {
    fun solution(common: IntArray): Int {
        var answer = 0
        val lastElement = common[common.size - 1]

        if (isArithmeticSequence(common)) {
            val commonDifference = common[1] - common[0]
            answer = lastElement + commonDifference
        } else {
            val commonRatio = common[1] / common[0]
            answer = lastElement * commonRatio
        }

        return answer
    }

    private fun isArithmeticSequence(sequence: IntArray): Boolean {
        val commonDifference = sequence[1] - sequence[0]
        for (i in 1 until sequence.size) {
            if (sequence[i] - sequence[i - 1] != commonDifference) {
                return false
            }
        }
        return true
    }
}
