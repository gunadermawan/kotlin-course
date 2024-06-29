package fundamental

fun main() {
//    declare if
    val number = 10
    if (number > 0) {
        println("positive")
    } else {
        println("negative")
    }

//    if expression
    val result = if (number > 0) "positive" else "negative"
    println(result)

//    declare when
    val day = 3
    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        else -> "invalid day"
    }
    println(dayName)

//    When pengganti if else
    val desc = when {
        number > 0 -> "positive"
        number < 0 -> "Negative"
        else -> "Zero"
    }
    println(desc)
}