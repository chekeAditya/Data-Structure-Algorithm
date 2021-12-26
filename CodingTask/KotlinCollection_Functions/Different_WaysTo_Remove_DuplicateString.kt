package Basic_To_Advanced_DataStructure.CodingTask.KotlinCollection_Functions

fun main() {

    //Maintain the original order of items
    val devs = arrayOf("Amit", "Ali", "Amit", "Sumit", "Sumit", "Himanshu")
    println(devs.distinct()) // [Amit, Ali, Sumit, Himanshu]

    //Maintain the original order of items
    println(devs.distinct()) // [Amit, Ali, Sumit, Himanshu]

    //Maintain the original order of items
    println(devs.toMutableSet()) // [Amit, Ali, Sumit, Himanshu]

    //Do Not Maintain the original order of items
    println(devs.toHashSet()) // [Amit, Himanshu, Sumit, Ali]
}