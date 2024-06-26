package fundamental

fun main() {

//    Boolean
    val isKotlinFun: Boolean = true
    val isJavaFun = false

//    Boolean operation
    println(isKotlinFun || isJavaFun)
    println(isKotlinFun && isJavaFun)
    println(!isKotlinFun)

//    Char
    val isLetter: Char = 'A'
    val isDigitOne = '1'
    val symbolAt = '@'

    println(isLetter)
    println(isLetter<isDigitOne)

//    Char function
    println(isLetter.isLetter())
    println(isDigitOne.isDigit())
    println(isLetter.lowercaseChar())

    var isUpperCase = true
    val charInput  = 'A'
    isUpperCase = charInput.isUpperCase()

    // condition
    if (isUpperCase){
        println("$charInput adalah huruf besar")
    } else{
        print("$charInput adalah huruf kecil")
    }
    val isDigit = isDigitOne.isDigit()
    println("$isDigitOne adalah digit? $isDigit")

}