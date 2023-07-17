class Solution {
    fun solution(s: String): String {
        val charCount = mutableMapOf<Char, Int>()
        for (char in s) {
            charCount[char] = charCount.getOrDefault(char, 0) + 1
        }

        val uniqueChars = mutableListOf<Char>()
        for ((char, count) in charCount) {
            if (count == 1) {
                uniqueChars.add(char)
            }
        }

        uniqueChars.sort()

        return uniqueChars.joinToString("")
    }
}
