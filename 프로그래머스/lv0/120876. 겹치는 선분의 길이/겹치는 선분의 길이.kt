class Solution {
    fun solution(lines: Array<IntArray>): Int {
        val map: MutableMap<Int, Int> = mutableMapOf()
        
        for (line in lines) {
            val tempMin = minOf(line[0], line[1]) 
            val tempMax = maxOf(line[0], line[1]) 
            
            for (i in tempMin until tempMax) {
                map[i] = map.getOrDefault(i, 0) + 1
            }
        }
    
        return map.count { it.value > 1 }
    }
}