fun main() {
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
    val baskets = IntArray(N)

    repeat(M) {
        val (i, j, k) = readLine()!!.split(" ").map { it.toInt() }
        putBallInBasket(baskets, i, j, k)
    }

    println(baskets.joinToString(" "))
}

fun putBallInBasket(baskets: IntArray, start: Int, end: Int, ball: Int) {
    for (i in start-1 until end) {
        baskets[i] = ball
    }
}