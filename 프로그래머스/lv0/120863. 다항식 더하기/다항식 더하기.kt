class Solution {
    fun solution(polynomial: String): String {
        var xCount = 0
        var num = 0

        val terms = polynomial.split(" + ")

        terms.forEach { term ->
            if (term.contains("x")) {
                xCount += if (term == "x") 1 else term.replace("x","").toString().toInt()
            } else {
                num += term.toInt()
            }
        }

        return (if (xCount != 0) if (xCount > 1) "${xCount}x" else "x" else "") + if (num != 0) (if (xCount != 0) " + " else "") + num else if (xCount == 0) "0" else ""
        
    }
}
