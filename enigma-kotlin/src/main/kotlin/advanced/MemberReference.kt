package advanced

data class Cars(val brand: String, val engine: Int)

fun main() {
    val toyota = listOf(Cars("Toyota", 2000), Cars("Honda", 2000))
    val engineSwap = toyota.map(Cars::brand)
    println(engineSwap)
    outer(5)
    val number = 10
    val result = factorial(number)
    println("Factorial $number is $result")
}

//inner function

fun outer(x: Int) {
    fun inner(y: Int): Int {
        return x + y
    }

    val result = inner(10)
    println("result: $result")
}

//Recursion

fun factorial(n: Int): Int {
    return if (n <= 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}