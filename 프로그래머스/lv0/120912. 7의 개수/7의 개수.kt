class Solution {
    fun solution(array: IntArray): Int = array.sumOf { it.toString().count { string -> string == '7' } 
    }
}
