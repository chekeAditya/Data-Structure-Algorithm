package Basic_To_Advanced_DataStructure.CodingTask.ScopeFunctions_Kotlin

import Basic_To_Advanced_DataStructure.CodingTask.SealedClass.*

/**
 * What ever the constructor we had inside the sealed class is private
 * Constructor of sealed class can either be protected(by default) or private
 * If we cut PostDoctorate class and paste it inSealedClass then it will work as it's in the same class
 * When we care working with the when case(switch case) then we don't have to work with else or default case.
 */


//class PostDoctorate:Student() {
//}

fun main(array: Array<String>) {

    val me: Student = Doctorate()

    when (me) {
        is Doctorate -> println("Doctorate")
        is PostDoctorate -> println("PostDoctorateStudent")
        is UnderGraduateStudent -> println("UnderGraduateStudent")
        is PostGraduateStudent -> println("PostGraduateStudent")
    }

}