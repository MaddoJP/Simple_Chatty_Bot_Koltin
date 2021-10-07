import java.util.*

fun main() {
    var i = 0
    var data = emptyArray<Int>()
    while (i < 4) {
        val n = readLine()!!.toInt()
        data += n
        i++
    }
    for (x in 0..1000) {
        if ((data[0] * x * x * x) + data[1] * x * x + data[2] * x + data[3] == 0) {
            println(x)
        }
    }
}