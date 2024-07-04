package oop

fun main() {
    DbConnect.connect()
    val myObject = MyClass.create()
    myObject.greet()
    val btnClick = object : ClickListener {
        override fun onClick() {
            println("button clicked")
        }
    }

    btnClick.onClick()
}


// singleton object
object DbConnect {
    val url = "google.com"
    fun connect() {
        println("connected to $url")
    }
}

// companion object
class MyClass {
    companion object {
        fun create(): MyClass = MyClass()
    }

    fun greet() {
        println("hello from MyClass")
    }
}

// annonymous class
interface ClickListener {
    fun onClick()
}