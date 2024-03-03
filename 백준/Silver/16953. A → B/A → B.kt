fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    var current = b
    var count = 0

    while (current > a) {
        count++
        if (current % 2 == 0) {
            current /= 2
        } else if (current % 10 == 1) {
            current /= 10
        } else {
            println(-1)
            return
        }
    }

    if (current == a) {
        println(count + 1) 
    } else {
        println(-1)
    }
}
