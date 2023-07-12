class Solution {
    fun solution(my_str: String, n: Int): Array<String> {
        val answer = mutableListOf<String>()
        
        var start = 0
        while (start < my_str.length) {
            if (my_str.length >= start + n) {
                answer.add(my_str.substring(start, start + n))            
            }
            else {
                answer.add(my_str.substring(start))
            }
            start += n
        }
        return answer.toTypedArray()
    }
}