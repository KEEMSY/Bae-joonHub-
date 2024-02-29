fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val coinValues = IntArray(n) { readLine()!!.toInt() }
    
    var remain = k // 남은 금액
    var count = 0 // 사용된 동전의 개수

    for (value in coinValues.reversed()) { // 가장 큰 동전부터 시작
        if (remain >= value) {
            count += remain / value // 해당 동전을 사용할 수 있는 최대 개수
            remain %= value // 남은 금액 업데이트
        }
    }

    println(count) // 필요한 동전 개수의 최솟값 출력
}