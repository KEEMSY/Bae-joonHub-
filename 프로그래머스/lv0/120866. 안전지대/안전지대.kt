class Solution {
    fun solution(board: Array<IntArray>): Int {
        val n = board.size
        val dx = intArrayOf(-1, 1, 0, 0, -1, -1, 1, 1)
        val dy = intArrayOf(0, 0, -1, 1, -1, 1, -1, 1)
        var safeAreaCount = 0

        for (i in 0 until n) {
            for (j in 0 until n) {
                if (board[i][j] == 1) {
                    continue 
                }

                var isSafe = true
                for (k in 0 until 8) {
                    val nx = i + dx[k]
                    val ny = j + dy[k]

                    if (nx in 0 until n && ny in 0 until n && board[nx][ny] == 1) {
                        isSafe = false
                        break
                    }
                }

                if (isSafe) {
                    safeAreaCount++
                }
            }
        }

        return safeAreaCount
    }
}
