fun main() {
    val n = readLine()!!.toInt() // 회의의 수 N 입력 받음
    val meetings = ArrayList<Pair<Int, Int>>(n)

    // N개의 회의에 대한 정보(시작 시간, 끝나는 시간) 입력 받아 저장
    for (i in 0 until n) {
        val (start, end) = readLine()!!.split(" ").map { it.toInt() }
        meetings.add(Pair(start, end))
    }

    // 회의를 끝나는 시간을 기준으로 오름차순 정렬, 끝나는 시간이 같다면 시작 시간으로 오름차순 정렬
    meetings.sortWith(compareBy({ it.second }, { it.first }))

    var count = 0 // 선택된 회의의 수
    var prevEnd = 0 // 이전에 선택된 회의의 끝나는 시간

    for (meeting in meetings) {
        // 이전 회의가 끝난 후에 시작하는 회의를 선택
        if (meeting.first >= prevEnd) {
            prevEnd = meeting.second
            count++
        }
    }

    println(count) // 최대 사용할 수 있는 회의의 최대 개수 출력
}