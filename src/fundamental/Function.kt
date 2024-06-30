package fundamental

fun main() {
    println(greet("Kotlin"))
    printMessage("hello kotlin!")
    println(add(5, 10))
    println(sum(4, 10, 11, 20, 50))
}

//    declare function
fun greet(name: String): String {
    return "Hello $name"
}

//Unit return function
fun printMessage(msg: String): Unit {
    println(msg)
}

//single expression

fun add(a: Int, b: Int): Int = a + b


// Varargs

fun sum(vararg numbers: Int): Int {
    return numbers.sum()
}

//function scope

fun topLevel() {
    fun localFun() {

    }
}

class MyClass {
    fun memberFunction() {

    }
}