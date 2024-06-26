package fundamental

fun main() {
    // Declaration
    val name = "Kotlin"
    val greeting = "Hello $name"

//    String literals
    val rawString = """
        Kotlin for programming
        And kotlin for fun
    """.trimIndent()
    val escapedString = "Hello \nworld!"

//    String Templating
    val x = 10
    val y = 7
    val result = "result of sum $x and $y is ${x + y}"

//    String Formating
    val version = 2.0
    val formattedString = String.format("Hello,  %s!, version: %f", name, version)


    println(greeting)
    println(rawString)
    println(escapedString)
    println(result)
    println(formattedString)
}