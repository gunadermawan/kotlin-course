package fundamental


fun main() {
    val sum = operate(4, 5) { a, b -> a + b }
    println(sum)
    println(add(5, 9))
    println(multiply(3, 5))
}

//    HOF -> high order function
fun operate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

//Function Types

val add: (Int, Int) -> Int = { a, b -> a + b }

//Anonymous Function

val multiply = fun(x: Int, y: Int): Int {
    return x * y
}