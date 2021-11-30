package Basic_To_Advanced_DataStructure.CodingTask.ScopeFunctions_Kotlin.with

class Person {
    val name: String = "Aditya"
    val age: Int = 19
}

fun main() {

    //without using scope function
    val person = Person()
    println(person.name)
    println(person.age)

    println()
    //with 'with' scope function
    with(person) {
        println(this.name) // println(name)
        println(this.age)  // println(age)
    }

    println()
    //return val
    val age_after_5Years = with(person){
        println("Understanding the return value...")
        println(age)
        age + 5 // this will return
    }
    println("Age after 5 years is: $age_after_5Years")

}