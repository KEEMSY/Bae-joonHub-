fun main() {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val appliances = readLine()!!.split(' ').map { it.toInt() }
    val pluggedIn = mutableSetOf<Int>()
    var unplugs = 0

    for (i in appliances.indices) {
        if (pluggedIn.contains(appliances[i])) {
            continue
        }
        if (pluggedIn.size < n) {
            pluggedIn.add(appliances[i])
            continue
        }
        val lastIndexMap = mutableMapOf<Int, Int>()
        for (j in pluggedIn) {
            val lastIndex = appliances.subList(i, k).indexOf(j)
            if (lastIndex == -1) {
                lastIndexMap[j] = Int.MAX_VALUE
            } else {
                lastIndexMap[j] = lastIndex
            }
        }
        val toUnplug = lastIndexMap.maxByOrNull { it.value }!!.key
        pluggedIn.remove(toUnplug)
        pluggedIn.add(appliances[i])
        unplugs++
    }

    println(unplugs)
}
