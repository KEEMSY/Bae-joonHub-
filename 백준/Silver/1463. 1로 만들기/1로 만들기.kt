fun main() {
    val n = readLine()!!.toInt()
    val dp = IntArray(n + 1) { Int.MAX_VALUE }
    dp[1] = 0 

    for (i in 2..n) {
        if (i % 3 == 0) dp[i] = minOf(dp[i], dp[i / 3] + 1) 
        if (i % 2 == 0) dp[i] = minOf(dp[i], dp[i / 2] + 1)
        dp[i] = minOf(dp[i], dp[i - 1] + 1) 
    }

    println(dp[n])
}