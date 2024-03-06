import java.util.PriorityQueue

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val pq = PriorityQueue<Long>()

    readLine()!!.split(" ").map { it.toLong() }.forEach { pq.add(it) }

    repeat(m) {
        val x = pq.poll() 
        val y = pq.poll() 
        pq.add(x + y) 
        pq.add(x + y)
    }

    println(pq.sum())
}