package Basic_To_Advanced_DataStructure.CodingTask.ScopeFunctions_Kotlin.apply

class Person {
    var name: String = "Aditya"
    var age: Int = 19
}

fun main() {
    /** Scope function: 'apply'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'context object'
     */

    val person = Person().apply {
        //here you can assign any property to the person
        this.name = "Aditya Cheke"
        age = 20
        age + 25
    }
    with(person) {
        println(name)
        println(age)
    }

    //if you want to modify it then you can do it using it also function
    person.also {
        it.name = "Karan Patil"
        it.age = 30
        println("The name and age is: ${it.name} , ${it.age}")
    }
}