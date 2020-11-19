fun sayHello(greeting:String, things:List<String>) {
    for(thing in things) {
        println(thing)
    }
}

//fun sayHello(greeting:String, things:List<String>) {
//    things.forEach{ thing ->
//        println("$greeting $thing")
//    }
//}

//fun sayHello(greeting:String, things:List<String>) {
//    things.forEachIndexed { index, thing ->
//        println("$thing is at index $index")
//    }
//}

//fun sayHello(greeting:String, map: Map<Int, String>) {
//    map.forEach { key, value -> println("$key -> $value") }
//}

fun main() {
//    val things = arrayOf("Kotlin", "Programming", "Comic Books")
    val things = listOf("Kotlin", "Programming", "Comic Books")

//    val things = mutableListOf("Kotlin", "Programming", "Comic Books")
//    things.add("Dogs")

//    println(things.size)
//    println(things[0])
//    println(things.get(0))

    sayHello("Hi", things)

//    val map = mapOf(1 to "a", 2 to "b", 3 to "c")

//    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
//    map.put(4, "d")
//    println(map)

//    sayHello("Hi", map)
}