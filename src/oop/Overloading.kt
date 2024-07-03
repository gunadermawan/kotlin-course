package oop

fun main() {
    val overloading = Overloading()
    println(overloading.add(2, 3))
    println(overloading.add(2, 3, 4))
    val cats = Cats("meow")
    cats.eat()

    val circles = Circles(5.0)
    println(circles.area())
    println(circles.perimeter())

    val bikes = Bikes()
    bikes.drive()
    bikes.stop()
}


// interfaces

interface Drivable {
    fun drive()
    fun stop()
}

class Bikes : Drivable {
    override fun drive() {
        println("bikes is biking")
    }

    override fun stop() {
        println("bikes is stop")
    }

}

// overloading

class Overloading {
    fun add(a: Int, b: Int): Int {
        return a * b
    }

    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
}

//inheritance

open class Animals(val name: String) {
    open fun eat() {
        println("$name eat")
    }
}

class Cats(name: String) : Animals(name) {
    override fun eat() {
        super.eat()
        println("$name cats is eating")
    }
}

// abstract class

abstract class Shapes {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circles(var radius: Double) : Shapes() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }

}