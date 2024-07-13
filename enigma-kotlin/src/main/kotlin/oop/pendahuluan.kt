package oop

import javax.xml.crypto.Data

fun main() {
    val cat = Cat("Catty")
    cat.sound()
    val shapes: Array<Shape> = arrayOf(Circle(), Square())
    for (shape in shapes) {
        shape.draw()
    }

    val car = Car(100)
    println(car.getSpeed())
    car.setSpeed(150)
    println(car.getSpeed())
    val bike = Bike("Honda")
    bike.drive()

    Database.connect()
    println(MathUtil.square(10))
}

// Abstraction
abstract class Vehicle(val name: String) {
    abstract fun drive()
}

class Bike(name: String) : Vehicle(name) {
    override fun drive() {
        println("$name is biking")
    }
}

//companion object
class MathUtil {
    companion object {
        fun square(number: Int) = number * number
    }
}

// singleton

object Database {
    val name = "MainDb"
    fun connect() {
        println("connected to database")
    }
}

// Encapsulation
class Car(private var speed: Int) {
    //    getter
    fun getSpeed(): Int {
        return speed
    }

    //    setter
    fun setSpeed(newSpeed: Int) {
        if (newSpeed >= 0) {
            speed = newSpeed
        } else {
            println("speed cannot be negative")
        }
    }
}

// inheritance

open class Animal(val name: String) {
    open fun sound() {
        println("$name makes a sound")
    }
}

class Cat(name: String) : Animal(name) {
    override fun sound() {
        super.sound()
        println("$name meow")
    }
}

// polymorphism

open class Shape {
    open fun draw() {
        println("Drawing a shape")
    }
}

class Circle : Shape() {
    override fun draw() {
        super.draw()
        println("Drawing a circle")
    }
}

class Square : Shape() {
    override fun draw() {
        super.draw()
        println("Drawing a square")
    }
}

