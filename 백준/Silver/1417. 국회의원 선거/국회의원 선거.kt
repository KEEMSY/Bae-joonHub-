import java.util.PriorityQueue

fun main() {
    val N = readLine()!!.toInt() 
    val dasomVotes = readLine()!!.toInt() 
    val pq = PriorityQueue<Int>(compareByDescending { it })

    repeat(N - 1) {
        pq.add(readLine()!!.toInt())
    }

    var bribes = 0
    var dasomCurrentVotes = dasomVotes

    while (pq.isNotEmpty() && pq.peek() >= dasomCurrentVotes) {
        val currentMaxVotes = pq.poll() - 1
        dasomCurrentVotes++
        bribes++
        pq.add(currentMaxVotes)
    }

    println(bribes)
}