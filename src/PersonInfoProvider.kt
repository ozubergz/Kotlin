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
class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {

    // override key word
//    override fun printInfo(person: Person) {
//        println("basicInfoProvider")
//        person.printInfo()
//    }

    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return "Session Id"
    }
}

fun main() {
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
    provider.getSessionId()
    checkTypes(provider)
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