fun main() {
    val t = readLine()!!.toInt() 

    repeat(t) {
        val n = readLine()!!.toInt() 
        val scores = List(n) {
            readLine()!!.split(" ").map { it.toInt() }.let { it[0] to it[1] }
        }.sortedBy { it.first } // 서류심사 성적으로 내림차순 정렬

        var count = 1 // 첫 번째 지원자는 항상 선발
        var interviewRank = scores[0].second // 첫 번째 지원자의 면접 성적을 기준으로 설정

        for (i in 1 until n) {
            if (scores[i].second < interviewRank) { // 현재 지원자의 면접 성적이 기준보다 좋은 경우
                count++ // 지원자 선발
                interviewRank = scores[i].second // 기준 업데이트
            }
        }

        println(count)
    }
}