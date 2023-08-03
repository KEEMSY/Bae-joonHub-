class Solution {
    fun solution(s: String): Int {
        val stack = mutableListOf<Int>()
        
        s.split(" ").forEach{ element ->
            when (element) {
                "Z" -> {
                  if (stack.isNotEmpty()) {
                        stack.removeAt(stack.size - 1) 
                    }
                }
                else -> {
                    val number = element.toInt()
                    stack.add(number) 
                }
            }
        }
        
        return stack.sum()
    }
}
