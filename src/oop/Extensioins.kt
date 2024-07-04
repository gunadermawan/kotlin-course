package oop

fun main() {
    val str = "Enigma"
    println(str.lastChar())

    val empty = "null"
    println(empty.isNullOrEmpty())

    println(divide(10, 3))
}

// extension
fun String.lastChar(): Char {
    return this[this.length - 1]
}


// nullable receiver
fun String?.isNullOrEmpty(): Boolean {
    return this == null || this.isEmpty()
}

// exception handling
fun divide(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println("error attempted")
        0
    } finally {
        println("division attempted")
    }
}
