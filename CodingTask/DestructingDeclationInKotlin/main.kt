package Basic_To_Advanced_DataStructure.CodingTask.DestructingDeclationInKotlin

data class Data(val name: String, val age: Int)

fun sendData(): Data {
    return Data("Aditya", 19)
}

fun main() {

    /** Using instance to access properties */
    val obj = sendData()
    println("Name is ${obj.name}")
    println("Age is ${obj.age}")

    /** Creating two variables using destructing declaration */
    val(name,age) = sendData()
    println("Name is $name")
    println("Age is $age")

}