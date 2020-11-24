interface PersonInfoProvider {

    val providerInfo: String

    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId() : String
}

//abstract key word won't allow you to create an instance class
//open key allows to extend class
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {

    protected open val sessionIdPrefix = "Session"

    // override key word
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}

fun main() {

    //an object expression allows you to create anonymous inner class
    val provider = object : PersonInfoProvider {

        override val providerInfo: String
            get() = "New Info Provider"

        fun getSessionId() = "id"

    }

    provider.printInfo(Person())
    provider.getSessionId()

//    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider) {
    if(infoProvider is SessionInfoProvider) {
        println("is a sessionInfoProvider")
//        (infoProvider as SessionInfoProvider).getSessionId()
        infoProvider.getSessionId()
    } else {
        println("not a sessionInfoProvider")
    }
}