class Solution {
    fun solution(chicken: Int): Int {
        var answer: Int = 0
        var coupons: Int = chicken
        while (coupons / 10 >= 1) {
            answer += coupons / 10
            coupons = coupons / 10 + coupons % 10
        }
        return answer
    }
}