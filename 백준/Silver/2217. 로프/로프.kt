fun main() {
    val n = readLine()!!.toInt() 
    val ropes = IntArray(n) { readLine()!!.toInt() } 

    ropes.sortDescending() 

    var maxWeight = 0 
    for (i in ropes.indices) {
        maxWeight = maxOf(maxWeight, ropes[i] * (i + 1)) 
    }

    println(maxWeight)
}