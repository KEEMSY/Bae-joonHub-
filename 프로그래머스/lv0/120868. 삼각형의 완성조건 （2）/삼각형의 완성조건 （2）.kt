class Solution {
    fun solution(sides: IntArray): Int {
        val (side1, side2) = sides.sorted() 
        val minPossibleSide = side2 - side1 + 1 
        val maxPossibleSide = side1 + side2 - 1 

        return maxPossibleSide - minPossibleSide + 1 
    }
}
