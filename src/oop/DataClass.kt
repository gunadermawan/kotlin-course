package oop

fun main() {
//    instance
    val user1 = User("boby", 24)

//    menggunakan toString()
    println(user1)

//        menggunakan equals dan hashCode

    val user2 = User("bibo", 23)
    println(user1 == user2)
    println(user1.hashCode() == user2.hashCode())

    // menggunakn copy
    val user3 = user1.copy("Anton", 22)
    println(user3)

//    destructuring declarations
    val (name, age) = user1
    println("Name: $name, Age: $age")
}


// declare data class
data class User(val name: String, val age: Int)