import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val intA = scanner.nextInt()
    val intB = scanner.nextInt()
    var sum = 0
    for (number in intA..intB) {
        sum += number
    }
    print(sum)
}