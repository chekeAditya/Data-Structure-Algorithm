package Basic_To_Advanced_DataStructure.CodingTask.HighOrderFuntions


/**
 * Definitions -> A function is called High order function when it is accepting an argument i.e a function or i.e returning
a function or it is doing accepting a function as an argument and returning a function as a return type.
 */

fun rollDice(
    range: IntRange,
    time: Int,
    callback: (result: Int) -> Unit, //defining a function syntax then you had to write -> and return type if you don't have then simply write unit
) {
    for (i in 0 until time) {
        val result = range.random()
        callback(result)
    }
}

fun main() {

    /** if it's at the end then you can pass it outside the argument also it's called trailing lambda
    rollDice(1..6, 4) { result ->
    println(result)
    }
     */

    rollDice(1..6, 4, { result ->
        println(result)
    })

    val result = rollDice { }
    println(result)

}

fun rollDice(callback: (result: Int) -> Unit): String {
    return "Dice Rolled"
}


