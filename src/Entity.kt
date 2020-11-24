interface IdProvider {
    fun getId(): String
}

class Entity private constructor(val id: String) {
    // you can name your companion obj, example: Factory
    companion object Factory : IdProvider {

        const val id = "id"

        override fun getId(): String {
            return "123"
        }

        fun create() = Entity(getId())
    }
}

fun main() {
//    val entity = Entity.Companion.create()
    val entity = Entity.Factory.create()
    Entity.id
}