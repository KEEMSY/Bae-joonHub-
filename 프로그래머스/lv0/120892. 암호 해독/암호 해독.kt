class Solution {
    fun solution(cipher: String, code: Int): String = cipher
        .filterIndexed { index, _ -> (index + 1) % code == 0 }
}