fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toLong() }

    val maxVisits = when {
        n == 1L -> 1
        n == 2L -> minOf(4, (m + 1) / 2)
        m < 7 -> minOf(4, m)
        else -> m - 2
    }

    println(maxVisits)
}