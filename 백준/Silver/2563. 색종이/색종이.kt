fun main() {
    val n = readLine()!!.toInt()
    val canvas = Array(100) { BooleanArray(100) }

    repeat(n) {
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
        attachPaper(canvas, x, y)
    }

    val blackArea = countBlackArea(canvas)
    println(blackArea)
}

fun attachPaper(canvas: Array<BooleanArray>, x: Int, y: Int) {
    for (i in x until x + 10) {
        for (j in y until y + 10) {
            canvas[i][j] = true
        }
    }
}

fun countBlackArea(canvas: Array<BooleanArray>): Int {
    var count = 0
    for (i in 0 until 100) {
        for (j in 0 until 100) {
            if (canvas[i][j]) {
                count++
            }
        }
    }
    return count
}