fun main() {
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
    val baskets = IntArray(N) { it + 1 }

    repeat(M) {
        val (i, j) = readLine()!!.split(" ").map { it.toInt() }
        switchBallInBaskets(baskets, i - 1 , j - 1)
    }

    println(baskets.joinToString(" "))
}

fun switchBallInBaskets(baskets: IntArray, targetA: Int, targetB: Int) {
    baskets[targetA] = baskets[targetB].also {baskets[targetB] = baskets[targetA]}
}