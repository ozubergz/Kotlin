//fun sayHello(itemToGreet:String) {
//    println("Hello $itemToGreet")
//}

//single line expression
fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main() {
    sayHello("Hey", "Kotlin")
    sayHello("Hello", "World")
}