package fundamental

fun main() {
    // declare String
    val name: String = "Kotlin"
    val greetings = "Hello, $name"
    println(greetings)

//    String literals
    val rawString = """
        Hello world!
        i'm using Kotlin
        and i'am verry excited!
    """.trimIndent()
    val escaptedString = "Hello \nworld!"
    println(rawString)
    println(escaptedString)

//    String templating

    val x = 5
    val y = 10
    val result = "Sum of $x + $y is ${x + y}"
    println(result)

//    String formating
    val version = 2
    val formatedString = String.format("Hello Kotlin! currently use version %d", version)
    println(formatedString)
}