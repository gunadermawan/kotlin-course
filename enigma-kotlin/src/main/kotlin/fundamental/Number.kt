package fundamental

fun main() {
    // int
    var number = 1

    // Float
    val phi = 3.14

    // convert
    number.toLong()
    phi.toFloat()

//    aritmatika
    number += 10
    number %= 2
    number -= 1

    val billion = 1_000_000

    println(billion)
    println("data type is ${billion::class.simpleName}")

}