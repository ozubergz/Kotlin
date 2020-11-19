fun sayHello(greeting:String, things:List<String>) {
    things.forEach{ thing ->
        println("$greeting $thing")
    }
}

fun main() {
//    val things = arrayOf("Kotlin", "Programming", "Comic Books")
    val things = listOf("Kotlin", "Programming", "Comic Books")
    sayHello("Hi", things)

//    val things = mutableListOf("Kotlin", "Programming", "Comic Books")
//    things.add("Dogs")
//
//    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
//    map.put(4, "d")
//    println(map)

//    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
//
//    map.forEach { key, value -> println("$key -> $value") }

//    println(things.size)
//    println(things[0])
//    println(things.get(0))

//    for(thing in things) {
//        println(thing)
//    }

//    things.forEach {
//        println(it)
//    }

//    things.forEach { thing ->
//        println(thing)
//    }

//    things.forEachIndexed { index, thing ->
//        println("$thing is at index $index")
//    }

}