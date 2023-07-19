class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        var count = 0

        for (num in i..j) {
            val digits = num.toString()
            count += digits.count { it.toString().toInt() == k }
        }

        return count
    }
}
