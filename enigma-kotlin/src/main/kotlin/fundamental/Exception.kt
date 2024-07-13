package fundamental

fun main() {
//    declare exception class
    try {
        val result = 10 / 0
    } catch (e: ArithmeticException) {
        println("Arithmatic Exception: ${e.message}")
    } finally {
        println("Block telah selesai untuk di eksekusi")
    }

//    nothing type
    fail("Error terjadi")
}

fun fail(msg: String): Nothing {
    throw IllegalArgumentException(msg)
}