package org.example.advanced

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun simpleFlow(): Flow<Int> = flow {
    for (i in 1..5) {
        delay(1000L)
        emit(i)
    }
}

fun main(): Unit = runBlocking {
//    use flow
    launch {
        simpleFlow().collect { value ->
            println("Flow value: $value")
        }
    }

//    use channel

    val channel = Channel<Int>()
    launch {
        for (x in 1..7) {
            channel.send(x)
            delay(500L)
        }
        channel.close()
    }
    for (y in channel) {
        println("Channel value is $y")
    }
}