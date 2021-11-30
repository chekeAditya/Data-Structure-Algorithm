package Basic_To_Advanced_DataStructure.CodingTask.ScopeFunctions_Kotlin.also

fun main() {
    /** Scope function 'main'
    Property 1: Refer to context object by using 'it'
    Property 2: The return valu is the 'context object'
     */

    val numberList: MutableList<Int> = mutableListOf(1, 2, 3)

    //Some other code
    //Operation on the 'numberList'

    val duplicate = numberList.also {
        println("The List element are: $it")
        it.add(4)
        println("The list elements after adding an element: $it")
        it.remove(2)
        println("The list elements after removing an element: $it")
    }

    println("Original Numbers: $numberList")
    println("Duplicate Numbers: $duplicate")

}