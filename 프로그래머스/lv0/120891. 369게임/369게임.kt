class Solution {
    fun solution(order: Int): Int 
        = order.toString().filter { it != '0' && it.toInt() % 3 == 0 }.count()
}