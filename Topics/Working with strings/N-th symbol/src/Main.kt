fun main() {
    val readString = readLine().toString()
    val number = readLine()!!.toInt()
    println("Symbol # $number of the string \"${readString}\" is '${readString[number - 1]}'")
}