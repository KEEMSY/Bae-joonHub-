fun main() {
    val expression = readLine()!!
    val numbers = expression.split("-") // '-'를 기준으로 식을 분리

    var minResult = 0 // 결과값 초기화

    for ((index, part) in numbers.withIndex()) {
        val sumOfPart = part.split("+").sumOf { it.toInt() } // 각 부분의 '+' 연산 처리
        
        if (index == 0) { // 첫 번째 부분은 더하기
            minResult += sumOfPart
        } else { // 이후 부분은 빼기
            minResult -= sumOfPart
        }
    }

    println(minResult)
}