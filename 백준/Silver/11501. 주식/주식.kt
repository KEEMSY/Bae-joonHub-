fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        val prices = readLine()!!.split(" ").map { it.toLong() }

        var maxProfit = 0L
        var maxPrice = 0L

        for (i in n - 1 downTo 0) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i]
            } else {
                maxProfit += maxPrice - prices[i]
            }
        }

        println(maxProfit)
    }
}
