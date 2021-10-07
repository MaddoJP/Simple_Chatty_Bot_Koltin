import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val age = scanner.nextInt()
    if (age in 18..59) {
        print("true")
    } else {
        print("false")
    }
}
