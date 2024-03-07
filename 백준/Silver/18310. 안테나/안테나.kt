fun main() {
    val n = readLine()!!.toInt()
    val houseLocations = readLine()!!.split(" ").map { it.toInt() }.sorted()

    val medianLocation = if (n % 2 == 0) {
        houseLocations[n / 2 - 1]
    } else {
        houseLocations[n / 2]
    }

    println(medianLocation)
}