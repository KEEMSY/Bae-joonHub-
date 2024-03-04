fun main() {
    val (n, l) = readLine()!!.split(" ").map { it.toInt() }
    val leaks = readLine()!!.split(" ").map { it.toInt() }.sorted()
    
    var count = 0
    var covered = 0.0
    
    for (leak in leaks) {
        if (leak + 0.5 > covered) {
            count++
            covered = leak +l - 0.5
        }
    }
    
    println(count)
}