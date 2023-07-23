class Solution {
    fun solution(dots: Array<IntArray>): Int {
        val slope1 = calculateSlope(dots[0], dots[1])
        val slope2 = calculateSlope(dots[2], dots[3])
        
        val slope3 = calculateSlope(dots[0], dots[2])
        val slope4 = calculateSlope(dots[1], dots[3])
        
        val slope5 = calculateSlope(dots[0], dots[3])
        val slope6 = calculateSlope(dots[1], dots[2])
        
        return if (slope1 == slope2 || slope3 == slope4 || slope5 == slope6) 1 else 0

    }
    
     private fun calculateSlope(point1: IntArray, point2: IntArray): Double {
        val (x1, y1) = point1
        val (x2, y2) = point2
        
        return (y2 - y1).toDouble() / (x2 - x1)
    }
}