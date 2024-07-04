package oop

fun main() {
    val users = Users("Anton", 24)
    val (name, age) = users
    println("Name: $name, Age: $age")

    val nested = Outer.Nested().foo()
    println(nested)

    val inner = Outer().Inner().foo()
    println(inner)

    val dir = Directions.EAST
    println(dir)
    val color = Color.RED
    println(color)

    val successStatus = DownloadStatus.Success
    val errorStatus = DownloadStatus.Error("Network Error")
    val inProgressStatus = DownloadStatus.inProgress
    handleDownloadStatus(successStatus)
    handleDownloadStatus(errorStatus)
    handleDownloadStatus(inProgressStatus)
}

//  destructuring
data class Users(val name: String, val age: Int)

// nested clas

class Outer {
    private val bar: Int = 1


    class Nested {
        fun foo() = 2
    }

    inner class Inner {
        fun foo() = bar
    }
}

//enum class

enum class Directions {
    NORTH, SOUTH, EAST, WEST
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

sealed class DownloadStatus {
    object Success : DownloadStatus()
    data class Error(val msg: String) : DownloadStatus()
    object inProgress : DownloadStatus()
}

fun handleDownloadStatus(status: DownloadStatus) {
    when (status) {
        is DownloadStatus.Success -> println("Success download")
        is DownloadStatus.Error -> println("Error download")
        DownloadStatus.inProgress -> println("Inprogress download")
    }
}