package fundamental

fun main() {
    // boolean declaration
    val isKotlinFun = true
    val isJavaFun = false

    // boolean manipulation
    println(isKotlinFun || isJavaFun)
    println(isKotlinFun && isJavaFun)
    println(!isKotlinFun)

    // Char
    val charA = 'A'
    val charB = 'B'
    val isDigitOne = '1'
    println(charA < charB)
    println(charA + 1)

    // char function and property
    println(charA.lowercaseChar())
    println(charA.isLetter())
    println(isDigitOne.isDigit())

//    combine
    val isUpperCase: Boolean
    val charInput = 'K'
    isUpperCase = charInput.isUpperCase()
    println(isUpperCase)

    if (isUpperCase){
        println("$isUpperCase adalah huruf besar")
    } else{
        println("$isUpperCase adalah huruf kecil")
    }
    val isDigit = isDigitOne.isDigit()

    println("Apakah $isDigitOne adalah digit? $isDigit")

}