package Basic_To_Advanced_DataStructure.CodingTask


fun main() {


    /**
     * This takes a function abc: () -> Unit
     * () represents that function takes no parameters.
     * Unit represents that the function does not return anything
     * So, the passMeFunction can take a function that takes zero parameters and does not return anything.
     */
    fun passMeFunction(abc: () -> Unit) {
        //can take function, do something here and execute the function
        abc()
    }


    /**function can return a function*/
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * (Int,Int) means that the function should take two parameters both as the int
     * Int means that the function should return value as an int
     *
     */
    fun returnMeAddFunction() : ((Int,Int) -> Int) {
        return ::add
    }

    val add = returnMeAddFunction()
    val result = add(2,3)
    println(result)
    println(add)


}