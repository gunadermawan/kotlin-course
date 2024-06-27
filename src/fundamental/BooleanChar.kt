package fundamental

fun main() {
//    declaration boolean
    val isKotlinFun = true
    val isJavaFun = false

//    boolean operation
    println(isKotlinFun || isJavaFun)
    println(isKotlinFun && isJavaFun)
    println(!isKotlinFun)

//    declaration Char
    val isLetterA = 'A'
    val isDigitOne = '1'

//    Char operation
    println(isLetterA < isDigitOne)
    println(isLetterA +1)

    println(isLetterA.isLetter())
    println(isDigitOne.isDigit())
    println(isLetterA.lowercaseChar())


}