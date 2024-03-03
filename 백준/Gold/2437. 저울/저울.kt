fun main() {
    val n = readLine()!!.toInt()
    val weights = readLine()!!.split(" ").map { it.toInt() }.sorted()
    
    var sum = 0
    
    for (weight in weights) {
        if (weight > sum + 1) {
            break
        }
        sum += weight
    }
    
    println(sum + 1)
}