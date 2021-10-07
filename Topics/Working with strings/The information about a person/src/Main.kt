import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val firstName = scanner.next()
    val secondName = scanner.next()
    val age = scanner.nextInt()
    println("${firstName?.get(0)}. $secondName, $age years old")
}