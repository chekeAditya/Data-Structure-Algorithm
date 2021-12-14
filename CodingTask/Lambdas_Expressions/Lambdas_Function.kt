package Basic_To_Advanced_DataStructure.CodingTask.Lambdas_Expressions


fun main() {

    /**
     * { value -> value } is a complete function in itself.
        It takes an int as a parameter and returns a value as an int.
     * In (Int) -> Int
     * (Int) represents input int as a parameter.
     * Int represents return type as an int.
     */
    val square: (Int) -> Int = { value -> value * value }
    val nine = square(3)
    println(nine)


    /**
     * Here do Nothing is the function in itself that takes the value as int and return same value as int
     */
    val doNothing : (Int) -> Int = { value -> value }
    println(doNothing(3))


    /**
     * This is also a lambda expression that takes two int as the parameters, adds them, and returns as an int.
     * { a, b -> a + b } is a function in itself that takes two int as the parameters, adds them, and returns as an int.
     * In (Int, Int) -> Int
     * (Int, Int) represents two int as the input parameters.
     * Int represents return type as an int.
     * So, the add is a function in itself that takes two int as the parameters, adds them, and returns as an int.
     */
    val add : (Int, Int) -> Int = { a, b -> a + b }
    println(add(10,20))



}