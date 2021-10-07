const val VOWELS = "aeiouAEIOU"

fun isVowel(char: Char): Boolean {
    return (char in VOWELS)
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}