import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val startRangeA = scanner.nextInt()
    val endRangeA = scanner.nextInt()
    val startRangeB = scanner.nextInt()
    val endRangeB = scanner.nextInt()
    val number = scanner.nextInt()
    if (number in startRangeA..endRangeA || number in startRangeB..endRangeB) {
        print("true")
    } else {
        print("false")
    }
}