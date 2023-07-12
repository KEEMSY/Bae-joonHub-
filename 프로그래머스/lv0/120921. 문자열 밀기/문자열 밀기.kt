class Solution {
    fun solution(A: String, B: String): Int {
        var answer: Int = 0
        var target: String = A
        
        for(i in 0 until A.length) {
            if (target == B) return answer
            
            target = target[target.lastIndex] + target.substring(0, target.length-1) 
            answer += 1
        }
        return -1
    }
}