class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        val boardWidth = board[0]
        val boardHeight = board[1]
        
        var x = 0
        var y = 0
        
        keyinput.forEach { key ->
            when (key) {
                "up" -> y = minOf(y + 1, boardHeight / 2)
                "down" -> y = maxOf(y - 1, -boardHeight / 2)
                "left" -> x = maxOf(x - 1, -boardWidth / 2)
                "right" -> x = minOf(x + 1, boardWidth / 2)
            }
        }
        
        return intArrayOf(x, y)
    }
}
