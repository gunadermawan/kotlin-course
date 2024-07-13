package advanced

class Box<T>(var content: T) {
    fun displayContent() {
        println(content)
    }
}

fun <T> printContent(content: T) {
    println(content)
}

//constraint type parameter

fun <T : Comparable<T>> findMax(a: T, b: T): T {
    return if (a > b) a else b
}

//covariant

interface Produce<out T> {
    fun produce(): T
}

fun demo(producer: Produce<String>) {
    val obj: Produce<Any> = producer
}

fun demoConv(consumer: Consumer<Number>) {
    val obj: Consumer<Double> = consumer
}

//contravariant

interface Consumer<in T> {
    fun consume(item: T)
}

//Invariant
class Container<T>(var item: T)

fun demoInv(container:Container<Number>){
    val obj:Container<Any> = container
}

fun main() {
    val intBox = Box(123)
    intBox.displayContent()
    val stringBox = Box("String Box")
    stringBox.displayContent()
    printContent(123)
    println("hello world!")
    println(findMax(3, 5))
    println(findMax("Mango", "Apple"))
}