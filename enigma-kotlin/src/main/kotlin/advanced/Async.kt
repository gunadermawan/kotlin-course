package org.example.advanced

import fundamental.printMessage
import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Start program: ${Thread.currentThread().name}")

    // Meluncurkan coroutine secara async
    val deferred1 = async { fetchDataFromNetwork(1) }
    val deferred2 = async { fetchDataFromNetwork(2) }
    val deferred3 = async { fetchDataFromNetwork(3) }

    // Menunggu hasil secara bersamaan
    val results = listOf(deferred1, deferred2, deferred3).map { it.await() }

    // Menampilkan hasil
    results.forEach { result -> println(result) }

    println("End program: ${Thread.currentThread().name}")
}

// Simulasi fungsi network call yang membutuhkan waktu
suspend fun fetchDataFromNetwork(id: Int): String {
    printMessage("Fetching data for ID $id on ${Thread.currentThread().name}")
    delay(1000L) // Simulasi delay selama 1 detik
    return "Data for ID $id"
}


