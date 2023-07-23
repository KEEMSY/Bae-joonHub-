class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray {
        return numlist.sortedWith(compareBy({ Math.abs(it - n) }, { -it })).toIntArray()
    }
}
