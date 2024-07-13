package org.example.advanced

import kotlinx.coroutines.*


fun main(): Unit = runBlocking {
//    memulai denga coroutines launch
    val job = launch {
        delay(1000L)
        println("World!")
    }

    val deferred = async {
        delay(3000L)
        10
    }

    println("Hello,")
    job.join() // menunggu job selesai
    println("The result is ${deferred.await()}")

//    dispatcher
    launch(Dispatchers.IO) {
        println("Running in I/O Context")
    }

}