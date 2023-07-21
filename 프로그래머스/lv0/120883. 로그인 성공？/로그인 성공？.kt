class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        val user = db.find { it[0] == id_pw[0] } ?: return "fail"
        if ( user[1] == id_pw[1] ) return "login"
        return "wrong pw"
    }
}