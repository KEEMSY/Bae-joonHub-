fun rotateMatrix(matrix: Array<IntArray>, N: Int, M: Int, R: Int) {
    val layers = minOf(N, M) / 2
    for (layer in 0 until layers) {
        val totalRotations = R % ((N + M - 2 - 4*layer) * 2)
        repeat(totalRotations) {
            // Top row
            val temp = matrix[layer][layer]
            for (j in layer until M - 1 - layer) {
                matrix[layer][j] = matrix[layer][j + 1]
            }
            // Right column
            for (i in layer until N - 1 - layer) {
                matrix[i][M - 1 - layer] = matrix[i + 1][M - 1 - layer]
            }
            // Bottom row
            for (j in M - 1 - layer downTo layer + 1) {
                matrix[N - 1 - layer][j] = matrix[N - 1 - layer][j - 1]
            }
            // Left column
            for (i in N - 1 - layer downTo layer + 1) {
                matrix[i][layer] = matrix[i - 1][layer]
            }
            matrix[layer + 1][layer] = temp
        }
    }
}

fun printMatrix(matrix: Array<IntArray>, N: Int, M: Int) {
    for (i in 0 until N) {
        for (j in 0 until M) {
            print("${matrix[i][j]} ")
        }
        println()
    }
}

fun main() {
    val (N, M, R) = readLine()!!.split(" ").map { it.toInt() }
    val matrix = Array(N) { IntArray(M) }
    for (i in 0 until N) {
        matrix[i] = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    }

    rotateMatrix(matrix, N, M, R)
    printMatrix(matrix, N, M)
}