import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val caseSize = nextInt()
    
    repeat(caseSize) {
        val students = nextInt()
        val studentsGrades = Array(students) { 0 }
        
        for ( i in 0 until students) {
            studentsGrades[i] = nextInt()
        }
        
        val avg = studentsGrades.sum() / students
        val overAvg = studentsGrades.filter { it > avg}.count()
        val result = String.format("%.3f", (overAvg.toFloat() / students * 100).toDouble()) + "%"
        
        println(result)
    }
}