fun main() {
    val testCases = generateSequence(::readLine).map(String::toInt).toList()
    testCases.forEach { n ->
        var count = 1
        var num = 1
        while (num % n != 0) {
            num = (num * 10 + 1) % n
            count++
        }
        println(count)
    }
}