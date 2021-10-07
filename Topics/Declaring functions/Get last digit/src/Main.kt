fun getLastDigit(number: Int): Char {
    val stringNumber = number.toString()
    return stringNumber.last()
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}