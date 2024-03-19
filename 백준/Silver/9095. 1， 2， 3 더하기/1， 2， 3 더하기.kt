fun main() {
    val dp = IntArray(12)
    dp[0] = 1
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4
    
    for (i in 4 until 12) {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
    }
    
    val T = readLine()!!.toInt()
    repeat(T) {
        val n = readLine()!!.toInt()
        println(dp[n])
    }
}