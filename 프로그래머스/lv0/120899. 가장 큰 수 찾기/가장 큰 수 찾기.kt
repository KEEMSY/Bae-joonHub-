class Solution {
    fun solution(array: IntArray): IntArray {
        return array.maxOf { it }.let {
            intArrayOf(it, array.indexOf(it))
        }
    }    
}
