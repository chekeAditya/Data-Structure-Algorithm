package Basic_To_Advanced_DataStructure.CodingTask.InlineFunctions


/**
 * Assume that we had 2 functions xyz and abc
 * Here we do not want to inline both the lambdas abc and xyz, just want to inline abc, but not xyz in that case we will not use inline before xyz
 * Below is the way we can use noinline function
 */

private inline fun doSomethingElse(abc: () -> Unit, noinline xyz: () -> Unit) {
    abc()
    xyz()
}





