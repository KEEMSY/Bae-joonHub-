import java.util.LinkedList
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val deque = LinkedList<Int>()

    repeat(n) {
        val command = br.readLine().split(" ")

        when (command[0]) {
            "push_front" -> deque.addFirst(command[1].toInt())
            "push_back" -> deque.addLast(command[1].toInt())
            "pop_front" -> bw.write("${if (deque.isEmpty()) -1 else deque.pollFirst()}\n")
            "pop_back" -> bw.write("${if (deque.isEmpty()) -1 else deque.pollLast()}\n")
            "size" -> bw.write("${deque.size}\n")
            "empty" -> bw.write("${if (deque.isEmpty()) 1 else 0}\n")
            "front" -> bw.write("${if (deque.isEmpty()) -1 else deque.first}\n")
            "back" -> bw.write("${if (deque.isEmpty()) -1 else deque.last}\n")
        }
    }

    bw.flush()
    bw.close()
    br.close()
}