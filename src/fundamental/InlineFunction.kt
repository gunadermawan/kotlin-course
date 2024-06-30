package fundamental

fun main() {
//    inline fun
    performOperation { println("Operation performed") }
//    noinline fun
    executeTask({ println("task 1") }, { println("task 2 noinline") })
//    non local return

    nonLocalReturn { true }
    nonLocalReturn { false }

//    inline properties
    println(square(5))
}


//inline fun

inline fun performOperation(operation: () -> Unit) {
    operation()
}

//no inline fun

inline fun executeTask(task1: () -> Unit, noinline task2: () -> Unit) {
    task1()
    task2()
}

//non-local return

inline fun nonLocalReturn(condition: () -> Boolean) {
    if (condition()) return
    println("Condition not met")
}

//inline properties
val square: (Int) -> Int
    inline get() = { it * it }