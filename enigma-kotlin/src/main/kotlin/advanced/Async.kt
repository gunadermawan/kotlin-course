package org.example.advanced

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Start program: ${Thread.currentThread().name}")

    // meluncurkan coroutine
    val deffered1 = async { (fetchDataFromNetwork(1)) }
    val deffered2 = async { (fetchDataFromNetwork(2)) }
    val deffered3 = async { (fetchDataFromNetwork(3)) }

    val results = listOf(deffered3, deffered2, deffered1)
    results.forEach { results -> println(results) }
    println("End program: ${Thread.currentThread().name}")
}

suspend fun fetchDataFromNetwork(id: Int): String {
    println("Fetching data for ID $id on ${Thread.currentThread().name}")
    delay(1000L)
    return "Data for ID $id"
}
