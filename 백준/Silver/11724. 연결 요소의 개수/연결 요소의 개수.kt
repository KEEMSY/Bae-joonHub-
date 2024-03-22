fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val graph = Array(n + 1) { mutableListOf<Int>() }
    val visited = BooleanArray(n + 1) { false }

    repeat(m) {
        val (u, v) = readLine()!!.split(" ").map { it.toInt() }
        graph[u].add(v)
        graph[v].add(u)
    }

    fun dfs(v: Int) {
        visited[v] = true
        for (u in graph[v]) {
            if (!visited[u]) {
                dfs(u)
            }
        }
    }
    var components = 0
    for (i in 1..n) {
        if (!visited[i]) {
            dfs(i)
            components++
        }
    }

    println(components)
}