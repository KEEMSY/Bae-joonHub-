import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    var answer = 0L
    for (i in 1..n) {
        answer += (n / i) * i
    }
    println(answer)
    close()
}