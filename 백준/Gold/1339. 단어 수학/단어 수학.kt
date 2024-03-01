fun main() {
    val n = readLine()!!.toInt()
    val words = List(n) { readLine()!! }
    val weightMap = mutableMapOf<Char, Int>()

    for (word in words) {
        var w = 1
        for (i in word.lastIndex downTo 0) {
            val char = word[i]
            weightMap[char] = weightMap.getOrDefault(char, 0) + w
            w *= 10
        }
    }

    // 가중치에 따라 알파벳을 정렬하고 숫자 할당
    val result = weightMap.values.sortedDescending().foldIndexed(0) { index, acc, value ->
        acc + value * (9 - index)
    }

    println(result)
}
