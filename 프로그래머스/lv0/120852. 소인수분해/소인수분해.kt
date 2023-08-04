class Solution {
    fun solution(n: Int): IntArray {
        val targets = mutableSetOf<Int>()
        var num = n
        var divisor = 2

        while (num > 1) {
            if (num % divisor == 0) {
                targets.add(divisor)
                num /= divisor
            } else {
                divisor++
            }
        }

        return targets.toIntArray()
    }
}
