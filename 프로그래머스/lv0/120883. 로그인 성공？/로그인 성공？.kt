class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        val targetId = id_pw[0]
        val targetPassword = id_pw[1]

        for (userData in db) {
            if (userData[0] == targetId && userData[1] == targetPassword) {
                return "login"
            } else if (userData[0] == targetId) {
                return "wrong pw"
            }
        }

        return "fail"
    }
}