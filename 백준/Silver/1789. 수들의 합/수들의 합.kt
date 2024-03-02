fun main() {
    val s = readLine()!!.toLong() 
    var n = 1L 
    var sum = 0L 

    while (sum + n <= s) { 
        sum += n 
        n++ 
    }

    println(n - 1) 
}