import java.io.*
import java.util.*

fun dfs(friends: Array<ArrayList<Int>>, visited: BooleanArray, start: Int, depth: Int): Boolean {
    if (depth == 4) return true
    visited[start] = true

    for (next in friends[start]) {
        if (!visited[next]) {
            if (dfs(friends, visited.clone(), next, depth + 1)) return true
        }
    }
    return false
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val friends = Array(n) { ArrayList<Int>() }

    repeat(m) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        friends[a].add(b)
        friends[b].add(a)
    }

    for (i in 0 until n) {
        if (dfs(friends, BooleanArray(n) { false }, i, 0)) {
            println(1)
            return
        }
    }
    println(0)
}