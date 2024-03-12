fun main() {
    val (E, S, M) = readLine()!!.split(' ').map { it.toInt() - 1 }
    var year = 0
    while (true) {
        if (year % 15 == E && year % 28 == S && year % 19 == M) {
            println(year + 1)
            break
        }
        year++
    }
}