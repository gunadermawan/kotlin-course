package advanced

import fundamental.sum

fun main() {
    println(sum(3, 5))
    println(double(5))
    val sum = calculate(3, 5) { a, b -> a + b }
    println(sum)
    val laptop = Computers("Lenovo", "14").apply {
        brand = "Apple"
        ScreenSize = "13"
    }
    println(laptop)
}


// function type
val sum: (Int, Int) -> Int = { a, b -> a + b }

// Lambda function
val double: (Int) -> Int = { x -> x * 5 }


// HOF
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}


// Lambda Receiver
data class Computers(var brand: String, var ScreenSize: String)