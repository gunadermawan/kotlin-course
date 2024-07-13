package oop

fun main() {
    val person = Person()
    println(person.name)
    println(person.age)
    val lateInit = LateInit()
    lateInit.initName()
    lateInit.printName()
    val lazyInit = LazyInit()
    println(lazyInit.name)
    val PrimaryConstructor = PrimaryConstructor("John", 26)
    println(PrimaryConstructor.name)
    val SecondaryConstructor = SecondaryConstructor("Kotlin", 19)
    println(SecondaryConstructor.age)
    val VisibilityModifier = VisibilityModifier()
    println(VisibilityModifier.publicProperty)
//    println(VisibilityModifier.privateProperty)
    println(VisibilityModifier.internalProperty)
//    println(VisibilityModifier.protectedProperty)
}

// properties
class Person {
    var name: String = "John"
    val age: Int = 25
}

// lateinit dan lazy properties

class LateInit {
    lateinit var name: String
    fun initName() {
        name = "Kotlin"
    }

    fun printName() {
        if (::name.isInitialized) {
            println(name)
        } else {
            println("name is not initilized")
        }
    }
}

class LazyInit {
    val name: String by lazy {
        println("Lazy init")
        "Kotlin"
    }
}

//primary constructor

class PrimaryConstructor(val name: String, var age: Int)

// secondary constructor

class SecondaryConstructor {
    var name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    constructor(name: String) {
        this.name = name
        this.age = 0
    }
}

// visibility modifiers

class VisibilityModifier {
    public var publicProperty: String = "public"
    private var privateProperty = "Private"
    protected var protectedProperty = "protected"
    internal var internalProperty = "internal"

    fun accessProperty() {
        println(publicProperty)
        println(privateProperty)
        println(protectedProperty)
        println(internalProperty)
    }
}