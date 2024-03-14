const val MOD = 1_000_000_009

fun main() {
    val T = readLine()!!.toInt()
    val dp = LongArray(1_000_001)
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4

    for (i in 4..1_000_000) {
        dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % MOD
    }

    repeat(T) {
        val n = readLine()!!.toInt()
        println(dp[n])
    }
}