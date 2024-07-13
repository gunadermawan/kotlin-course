package org.example.advanced

import kotlinx.coroutines.*
import java.util.concurrent.locks.ReentrantLock

fun main() = runBlocking {
    repeat(100) {
        launch {
            delay(1000L)
            println("Task $it finished")
        }
    }
}

// I/O
fun mainIo() = runBlocking {
    launch(Dispatchers.IO) {
        delay(3000L)
        println("I/O task finished")
    }
}

//deadlocks and live locks

val lock1 = ReentrantLock()
val lock2 = ReentrantLock()


