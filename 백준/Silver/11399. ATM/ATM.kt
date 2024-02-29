fun main() {
    val n = readLine()!!.toInt() // 사람의 수 N을 입력 받음
    val p = readLine()!!.split(" ").map { it.toInt() }.sorted() // 각 사람이 돈을 인출하는데 걸리는 시간 Pi를 입력 받아 정렬

    var sum = 0 // 각 사람이 돈을 인출하는데 필요한 시간의 합
    var currentSum = 0 // 현재까지의 누적 시간

    for (time in p) {
        currentSum += time // 현재 사람의 대기 시간을 누적 시간에 더함
        sum += currentSum // 누적 시간을 전체 합에 더함
    }

    println(sum) // 결과 출력
}