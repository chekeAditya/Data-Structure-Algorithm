package Basic_To_Advanced_DataStructure.CodingTask.ExtensionsFunctions

class Circle(val radius: Double) {
    fun area(): Double {
        return Math.PI * radius * radius
    }
}

fun main() {
    /*Extension function created for a circle Class*/
    fun Circle.perimeter(): Double {
        return 2 * Math.PI * radius
    }

    val newCircle = Circle(20.4)
    println("Area of circle is ${newCircle.radius}")
    println("Perimeter of circle is ${newCircle.perimeter()}")
}