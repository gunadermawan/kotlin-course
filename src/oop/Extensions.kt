package oop

fun main() {
    val string = "Enigma"
    println(string.lastChar())
    val stringNullable: String? = null
    println(stringNullable?.isNullOrEmpty())

    println(divide(10, 0))
}

// extensions
fun String.lastChar(): Char {
    return this[this.length - 1]
}

// nullable receiver

fun String?.isNullOrEmpty(): Boolean {
    return this == null || this.isEmpty()
}

//exception

fun divide(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println(message = "cannot divide by zero")
        0
    } finally {
        println("division attempeted")
    }
}