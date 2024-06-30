package fundamental

fun main() {
//    declare array
    val numbers = arrayOf(1, 4, 0, 2, 9)
    val strings = arrayOf("Kotlin", "Java", "Swift")
//    array primitive
    val intArray = intArrayOf(1, 2, 3)
    val doubleArray = doubleArrayOf(1.0, 2.0, 3.0)
//    constructor
    val squeares = Array(5) { it * it }

//    mengakses array
    println(numbers[0])

    strings[1] = "PHP"
    println(strings[1])


//    iterasi dengan array
    for (number in numbers) {
        println(number)
    }

//   works with HOF
    val sortedNumbers = numbers.sortedArray()
    println(sortedNumbers.joinToString())

    val evenNumbers = numbers.filter { it % 2 === 0 }
    println(evenNumbers.joinToString())
}