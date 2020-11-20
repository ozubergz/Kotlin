fun sayHello(greeting:String, vararg things:String) {
    things.forEach { thing ->
        println("$greeting $thing")
    }
}

fun greetPerson(greet:String, name:String) = println("$greet $name")

fun main() {
//    val things = listOf("Kotlin", "Programming", "Comic Books")
     val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")

//    sayHello("Hi", "Kotlin", "Programming", "Comic Books")
//    sayHello("Hi", *interestingThings)

//  pass arguments in order
    greetPerson("Hi", "Kotlin")

//  pass named arguments
    greetPerson(name = "World", greet = "Hello")

//  pass named arguments
    sayHello(things = *interestingThings, greeting = "Hi")
}