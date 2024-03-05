fun convert(s: String, t: String): Boolean {
    var modifiedT = StringBuilder(t)
    while (s.length < modifiedT.length) {
        if (modifiedT.last() == 'A') {
            modifiedT.deleteCharAt(modifiedT.lastIndex)
        } else if (modifiedT.last() == 'B') {
            modifiedT.deleteCharAt(modifiedT.lastIndex)
            modifiedT.reverse()
        }
    }
    return s.contentEquals(modifiedT)
}

fun main() {
    val s = readLine()!!
    val t = readLine()!!

    if (convert(s, t)) println(1) else println(0)
}