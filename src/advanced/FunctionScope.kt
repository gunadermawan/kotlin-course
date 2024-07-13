package advanced

import java.util.*

fun main() {
    val name: String? = "Enigma"
    name?.let {
        println(it.uppercase(Locale.getDefault()))
    }
    println(animals)
    println(numbers)
}

// scope function with lambda receiver

data class Animals(var name: String, var age: Int = 0)

val animals = Animals("Cat").apply {
    age = 20
}


//scope funtion with lambda arguments
val numbers = mutableListOf(1, 2, 3).also {
    println("Original list is : $it")
}.apply {
    add(4)
    add(5)
}