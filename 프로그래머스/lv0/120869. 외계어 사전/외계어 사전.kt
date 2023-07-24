class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        val checkedList = dic.filter { it.length == spell.size }
        return if (checkedList.any { word -> spell.all { word.contains(it) } }) 1 else 2
    }
}