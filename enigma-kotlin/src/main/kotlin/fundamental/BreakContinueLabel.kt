package fundamental

fun main() {
    println("break section")
    loop@ for (i in 1..5) {
        for (j in 1..5) {
            if (j == 3) break@loop
            println("i: $i, j:$j")
        }
    }
    println("continue section")
    for (i in 1..5) {
        for (j in 1..5) {
            if (j == 3) continue
            println("i: $i, j:$j")
        }
    }
    println("return to labels")

    fun findNumber() {
        listOf(1, 2, 3, 4, 5).forEach loop@{ iterate ->
            if (iterate == 3) return@loop // nilai tidak akan dicetak (kembali ke loop)
            println(iterate)
        }
        println("Done with loop")
    }
    findNumber()
}