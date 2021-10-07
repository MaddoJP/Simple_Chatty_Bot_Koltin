import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    val start = scanner.nextInt()
    val end = scanner.nextInt()
    if (number in start..end) {
        print("true")
    } else {
        print("false")
    }
}