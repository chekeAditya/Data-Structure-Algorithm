package Basic_To_Advanced_DataStructure.CodingTask.KotlinCollection_Functions

fun main() {


    /**
     * You can convert an array or list into a string by using joinToString
     */
    val someKotlinCollectionFunctions = listOf(
        "distinct", "map",
        "isEmpty", "contains",
        "filter", "first",
        "last", "reduce",
        "single", "joinToString"
    )

    val message = someKotlinCollectionFunctions.joinToString(
        separator = ", ",
        prefix = "Kotlin has many collection functions like: ",
        postfix = "and they are awesome.",
        limit = 3,
        truncated = "etc "
    )

    // Kotlin has many collection functions like: distinct, map, isEmpty, etc and they are awesome.
    println(message)

}