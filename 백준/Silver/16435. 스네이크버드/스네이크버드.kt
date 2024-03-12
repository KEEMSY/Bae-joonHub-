fun main() {
    val (n, initialLength) = readLine()!!.split(" ").map { it.toInt() }
    val fruits = readLine()!!.split(" ").map { it.toInt() }.sorted()

    var snakebirdLength = initialLength

    for (fruit in fruits) {
        if (fruit <= snakebirdLength) {
            snakebirdLength++
        } else {
            break
        }
    }

    println(snakebirdLength)
}