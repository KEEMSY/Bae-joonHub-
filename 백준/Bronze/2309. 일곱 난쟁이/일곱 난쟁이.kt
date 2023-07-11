fun main() {
    val heights = Array(9) { 0 }
    repeat(9) { heights[it]= readLine()!!.toInt() }
    heights.sort()
    
    val sum = heights.sum()
    var target1 = -1
    var target2 = -1
    var isFinished: Boolean = false
    
    for (i in 0 .. 8) {
        for ( j in 0 .. 8) {
            if ( i == j) continue
            
            val seven = sum - heights[i] - heights[j]
            if ( seven == 100) {
                target1 = i
                target2 = j
                isFinished = true
                break
            }
        }
        if ( isFinished ) break
    }
    
    repeat(9) {
        if ( it != target1 && it != target2) {
            println(heights[it])
        }
    }
}