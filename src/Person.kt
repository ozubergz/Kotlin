// youc can give a class non-visibility by typing private before class
class Person(val firstName: String = "Peter", val lastName: String = "Parker") {

    //you can give property non-visibility by typing private or protected before var
    var nickName: String? = null
        // setter
        set(value) {
            field = value
//            println("set nickname is $value")
        }

        // getter
        get() {
//            println("get nickname, $field")
            return field
        }

        //method
        fun printInfo() {
//            val nickNameToPrint = if(nickName != null) nickName else "no nickname"
            val nickNameToPrint = nickName ?: "no nickname"

            println("$firstName ($nickNameToPrint) $lastName")
        }

    //initializing properties to this class
    //But, you can initialize properties inside the parameter

//    val firstName: String = _firstName
//    val lastName: String = _lastName

    // initializer, but it's not required as long it's been defined and initialized at the top
    // init block will always run first before constructor

//    init {
//        firstName = _firstName
//        lastName = _lastName
//    }

    //default values; this is the secondary constructor
    //secondary constructor is not required as long as default values is assigned in the parameters

//    constructor(): this("Peter", "Parker") {
//        println("secondary constructor")
//    }


}