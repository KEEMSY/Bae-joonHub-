fun main() {
    val n = readLine()!!.toInt()
    val cranes = readLine()!!.split(" ").map { it.toInt() }.sortedDescending()
    val m = readLine()!!.toInt()
    val boxes: MutableList<Int> = readLine()!!.split(" ").map { it.toInt() }.sortedDescending().toMutableList()
    
    if (cranes[0] < boxes[0]) {
        println(-1)
        return
    }
  
    var time = 0
    while (boxes.isNotEmpty()) {
        var boxIndex = 0
        var craneIndex = 0
        while (craneIndex < cranes.size) {
            if (boxIndex == boxes.size) break
            if (cranes[craneIndex] >= boxes[boxIndex]) {
                boxes.removeAt(boxIndex)
                craneIndex++
            } else {
                boxIndex++
            }
        }
        time++
    }
    
    println(time)
}