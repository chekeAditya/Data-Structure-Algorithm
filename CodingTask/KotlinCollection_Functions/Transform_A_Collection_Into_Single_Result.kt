package Basic_To_Advanced_DataStructure.CodingTask.KotlinCollection_Functions

fun main() {

    /**
     * If you want to transform a given collection into a single result, then you can use reduce function
     */

    val numList = listOf(1, 2, 3, 4, 5)
    val result = numList.reduce{ result,item ->
        result + item
    }

    println(result) //15

    // If list is empty then it will throw an exception called RunTimeException
}