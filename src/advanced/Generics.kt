package advanced

class Box<T>(var content: T) {
    fun displayContent() {
        println(content)
    }
}

//func generics

fun <T> printContent(content: T) {
    println(content)
}

//constraint type parameter

fun <T : Comparable<T>> findMax(a: T, b: T): T {
    return if (a > b) a else b
}

// Variance covariant
interface Producer<out T> {
    fun produce(): T
}

fun demo(producer: Producer<String>) {
    val obj: Producer<Any> = producer
}

// Contravariant


interface Consumer<in T> {
    fun consume(item: T)
}

fun demoCons(consumer: Consumer<Number>) {
    val obj: Consumer<Double> = consumer
}
// invariant

class  Container<T> (var item : T)

fun demoCont(container: Container<Number>){
    val obj: Container<Number> = container
}

fun main() {
    val intBox = Box(123)
    intBox.displayContent()
    val stringBox = Box("Enigma")
    stringBox.displayContent()
    printContent("Hello kotlin")
    printContent(123)

    println(findMax(1, 4))
    println(findMax("Apple", "Mango"))
}