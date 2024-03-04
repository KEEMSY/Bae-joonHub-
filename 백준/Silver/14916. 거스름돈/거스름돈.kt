fun main() {
    val n = readLine()!!.toInt()
    var count = 0
    
    var money = n
    var fiveCoins = money / 5
    money %= 5
    
    while (fiveCoins >= 0) {
        if (money % 2 == 0) {
            count = fiveCoins + (money / 2)
            println(count)
            return
        }
        fiveCoins --
        money += 5
    }
    println(-1)
}