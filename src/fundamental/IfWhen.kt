
package fundamental

fun main() {
//    declare if
    val day = 5
   if (day > 0){
       println("positive")
   } else{
       println("negative")
   }

    val result = if (day >0)"positive" else "Negative"
    println(result)

//    declare when
    val dayName = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        else -> "Invalid Number"
    }
    println(dayName)

//    when replace if else
    val desc = when {
        day > 0 -> "positive"
        day <0 -> "Negative"
        else ->  "Invalid Number"
    }
    println(desc)
}