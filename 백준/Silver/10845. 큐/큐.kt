import java.util.LinkedList
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val queue = LinkedList<Int>()

    for (i in 1..n) {
        val command = br.readLine().split(" ")

        when (command[0]) {
            "push" -> queue.add(command[1].toInt())
            "pop" -> bw.write("${if (queue.isEmpty()) -1 else queue.poll()}\n")
            "size" -> bw.write("${queue.size}\n")
            "empty" -> bw.write("${if (queue.isEmpty()) 1 else 0}\n")
            "front" -> bw.write("${if (queue.isEmpty()) -1 else queue.first}\n")
            "back" -> bw.write("${if (queue.isEmpty()) -1 else queue.last}\n")
        }
    }

    bw.flush()
    bw.close()
    br.close()
}