package Basic_To_Advanced_DataStructure.CodingTask.InlineFunctions


/**
 * In order to understand the crossinline, we need to understand "non-local returns".
 *
 */

private fun doSomething() {
    print("doSomething start")
    doSomethingElse {
        print("doSomethingElse")
        return // notice this return
    }
    print("doSomething end")
}

inline fun doSomethingElse(abc: () -> Unit) {
    // I can take function
    // do something else here
    // execute the function
    abc()
}

/**
 * Decompiled Code *
public void doSomething() {
    System.out.print("doSomething start");
    System.out.print("doSomethingElse");
}

 * Here we can see that there is no System.out.print("doSomething end"). As we have added the return inside the lambdas, it allowed the non-local returns and left the code below that
 * How to avoid this ?
 * We need to add the crossinline then it will not allow us the put the return inside that lambdas


fun doSomething() {
    print("doSomething start")
    doSomethingElse {
        print("doSomethingElse")
        // return is not allowed here
    }
    print("doSomething end")
}

inline fun doSomethingElse(crossinline abc: () -> Unit) {
    // I can take function
    // do something else here
    // execute the function
    abc()
}
*/