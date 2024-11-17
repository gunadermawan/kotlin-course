package fundamental

fun main() {
//    bilangan bulat
    val intNumber: Int = 123
    val longNumber: Long = 123L
    val shortNumber: Short = 3200
    val byteNumber: Byte = 123

    // bilangan desimal
    val floatNumber: Float = 3.14f
    val doubleNumber: Double = 3.141292

    // operasi bilangan
    val sum: Int = intNumber + 10
    val product: Double = doubleNumber * 3

    // konversi
    val convertedNumber: Double = intNumber.toDouble()

    println("Int: $intNumber")
    println("Long: $longNumber")
    println("short: $shortNumber")
    println("byte: $byteNumber")

    println("Sum (Int + 10): $sum")

    println("Converted (Int to Double): $convertedNumber")

}