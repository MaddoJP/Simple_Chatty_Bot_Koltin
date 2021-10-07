import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numbers = scanner.nextInt()
    var sum = 0
    for (i in 1..numbers) {
        sum += scanner.nextInt()
    }
    print(sum)
}