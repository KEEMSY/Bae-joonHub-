class Solution {
    fun solution(dots: Array<IntArray>): Int {

        val x1 = dots[0][0]
        val y1 = dots[0][1]
        
        val x2 = dots[1][0]
        val y2 = dots[1][1]
        
        val x3 = dots[2][0]
        val y3 = dots[2][1]
        
        val xLength = maxOf(Math.abs(x2 - x1), Math.abs(x3 - x1))
        val yLength = maxOf(Math.abs(y2 - y1), Math.abs(y3 - y1))
        

        val area = xLength * yLength
        
        return area
    }
}