package oop

fun main() {
//    immutable list
    val fruits = listOf("Apple", "Banana", "Cherry")
    println(fruits)
    println(fruits[0])


//    mutable list
    val car = mutableListOf("toyota", "suzuki", "Honda")
    car.add("MG")
    println(car)
    println(car[2])

//    immutable set
    val number = setOf(1,2,3,4)
    println(number)
    println(number.contains(2))

//    mutable set
    val numbers = mutableSetOf(1,2,3,4,5)
    numbers.add(6)
    println(numbers)
    numbers.remove(2)
    println(numbers)

//    immutable map
    val country = mapOf("USA" to "Washington,DC", "IND" to "Jakarta")
    println(country)
    println(country["IND"])

//    mutable map
    val city = mutableMapOf("IND" to "Jakarta", "USA" to "WASHINGTON, DC")
    city["IND"] = "SEMARANG"
    println(city)
    city.remove("USA")
    println(city)
}