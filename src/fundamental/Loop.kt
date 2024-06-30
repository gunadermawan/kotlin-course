package fundamental

fun main() {
//    declare For
    val number = listOf(1, 2, 3, 4, 5)
    for (number in number) {
        println(number)
    }

    println("rentang ankga")
    for (i in 1..7){
        println(i)
    }
    println("stepper")
    for (i in 1..10 step 2){
        println(i)
    }
    println("mundur")
    for (i in 10 downTo 1){
        println(i)
    }
    println("while section")
//    declare while loops
    var counter = 5
    while (counter >0){
        println("counter : $counter")
        counter--
    }

//    do-while
    println("do while section")
    do {
        println("this will repeat at least once")
    } while (counter>0)
}