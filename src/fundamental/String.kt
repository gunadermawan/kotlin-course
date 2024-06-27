package fundamental

fun main() {
//    declare String
    val name = "Kotlin"
    val greetings = "Hello, $name!"
    println(greetings)

//    String literals
    val rawString = """
        Hello world!,
        i'am using Kotlin
        and i'am very excited!!
    """.trimIndent()

    val escapedString = "Hello \nkotlin!"
    println(rawString)
    println(escapedString)

//    String templating
    val x = 10
    val y = 10
    val result = "sum $x and $y is ${x + y}"
    println(result)

//    String formating
    val version = 2.0
    val formatingString = String.format("Hello %s, currently use version %f", name, version)
    println(formatingString)
}