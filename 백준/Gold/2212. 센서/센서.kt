fun main() {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    val sensorCoordinates = readLine()!!.split(" ").map { it.toInt() }.sorted()

    if (k >= n) {
        println(0)
        return
    }

    val distances = sensorCoordinates.zipWithNext { a, b -> b - a }.sortedDescending()
    val minDistanceSum = distances.drop(k - 1).sum()

    println(minDistanceSum)
}
