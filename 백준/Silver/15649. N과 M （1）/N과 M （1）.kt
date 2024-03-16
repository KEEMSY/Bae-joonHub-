fun generateSequences(sequence: IntArray, used: BooleanArray, n: Int, m: Int, depth: Int) {
    if (depth == m) {
        println(sequence.joinToString(" "))
        return
    }

    for (i in 1..n) {
        if (!used[i]) {
            sequence[depth] = i
            used[i] = true
            generateSequences(sequence, used, n, m, depth + 1)
            used[i] = false
        }
    }
}

fun main() {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val sequence = IntArray(m)
    val used = BooleanArray(n + 1) { false }

    generateSequences(sequence, used, n, m, 0)
}