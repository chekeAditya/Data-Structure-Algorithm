package Basic_To_Advanced_DataStructure.CodingTask.InlineFunctions

fun doSomething() {
    println("doSomething start")
    doSomethingElse()
    println("doSomething end")
}

inline fun doSomethingElse() {
    println("doSomethingElse")
}
