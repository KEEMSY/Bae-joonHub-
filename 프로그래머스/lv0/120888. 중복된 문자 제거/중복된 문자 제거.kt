class Solution {
    fun solution(my_string: String): String {
        val uniqueChars = StringBuilder()
        val seenChars = mutableSetOf<Char>()
        
        for (char in my_string) {
            if (!seenChars.contains(char)) {
                uniqueChars.append(char)
                seenChars.add(char)
            }
        }
        
        return uniqueChars.toString()
    }
}