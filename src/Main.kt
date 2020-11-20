//fun sayHello(greeting:String, vararg things:String) {
//    things.forEach { thing ->
//        println("$greeting $thing")
//    }
//}

//fun greetPerson(greet:String, name:String) = println("$greet $name")

fun main() {
    val person = Person("John", "Doe")
    person.printInfo()
}