package fundamental

fun main() {
//    declare String
    val name = "Kotlin"
    val greetings = "Hello, $name"
    println(greetings)

//    String literals
    val rawString = """
        hello kotlin!
        i'am using kotlin
        and very happy!
    """.trimIndent()
    println(rawString)
    val escaptedString = "Hello \nfkotlin"
    println(escaptedString)

//    String templating
    val x = 5
    val y = 10
    val result = "Sum $x and $y is ${x + y}"
    println(result)

//    String formatting
    val version = 2
    val programming = "Kotlin"
    val formattedString = String.format("Hello %s, currently using version %d", programming, version)
    println(formattedString)
}