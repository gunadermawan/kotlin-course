package oop

fun main() {
//    fold
    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = numbers.fold(0) { acc, number -> acc + number }
    println(sum)

//    drop
    val drop = listOf(1, 2, 3, 4, 5)
    val droped = drop.drop(3)
    println(droped)

//    take

    val take = listOf(1, 2, 3, 4, 5)
    val taken = take.take(2)
    println(taken)

//    Slice
    val slice = listOf(1, 2, 3, 4, 5)
    val sliced = slice.slice(1..2)
    println(sliced)

//    distinct

    val distinct = listOf(1, 2, 3, 4, 5, 5, 3, 5, 1, 2)
    val distinctNumber = distinct.distinct()
    println(distinctNumber)

//    chunked
    val chunked = (1..15).toList()
    val chuncked = chunked.chunked(2)
    println(chuncked)
}