package Basic_To_Advanced_DataStructure.CodingTask.InlineFunctions

private fun doSomething() {
    println("doSomething start")
    doSomethingElse()
    println("doSomething end")
}

//fun doSomethingElse() { //without inline function
private inline fun doSomethingElse() { //with inline function
    println("doSomethingElse")
}
/**
 *  Here without inline decompiled code looks like this
public void doSomething() {
    System.out.print("doSomething start");
    doSomethingElse();
    System.out.print("doSomething end");
}

public void doSomethingElse() {
    System.out.print("doSomethingElse");
}

 * Here with inline function decompiled code looks like this
public void doSomething() {
    System.out.print("doSomething start");
    System.out.print("doSomethingElse");
    System.out.print("doSomething end");
}
 */


private fun doSomethingWithHighOrderAndLambdasFunction(){
    print("doSomething_With_HighOrderAndLambdasFunction")
    doSomething_ElseWith_HighOrderAndLambdasFunction{
        print("doSomething_Else_WithHighOrderAndLambdasFunction")
    }
    println("doSomethingWithHighOrderAndLambdasFunction_End")
}

//fun doSomething_ElseWith_HighOrderAndLambdasFunction(abc:() -> Unit) {
private inline fun doSomething_ElseWith_HighOrderAndLambdasFunction(abc:() -> Unit) {
    abc()
}
/**
 * Decompiled Code looks like this without inline function *
public void doSomething() {
System.out.print("doSomething start");
doSomethingElse(new Function() {
@Override
public void invoke() {
System.out.print("doSomethingElse");
}
});
System.out.print("doSomething end");
}

public void doSomethingElse(Function abc) {
abc.invoke();
}


 * Decompiled Code looks like this with inline function *
public void doSomething() {
    System.out.print("doSomething start");
    System.out.print("doSomethingElse");
    System.out.print("doSomething end");
}
 * As we can see that the code of the doSomethingElse
 */






