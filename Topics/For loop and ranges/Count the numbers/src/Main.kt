import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val start = scanner.nextInt()
    val end = scanner.nextInt()
    val number = scanner.nextInt()
    var counter = 0
    for (x in start..end) {
        if (x % number == 0) {
            counter++
        }
    }
    println(counter)
}