// write your code here

fun divide(zaehler: Double, nenner: Double): Double {
    return zaehler / nenner
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    println(divide(a, b))
}