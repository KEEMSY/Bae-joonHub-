class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer = 0

        for (word in babbling) {
            var newWord = word.replace(Regex("aya|woo|ye|ma"), "")
            if (newWord.isEmpty()) {
                answer++
            }
        }

        return answer
    }
}
