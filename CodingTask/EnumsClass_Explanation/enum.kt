package Basic_To_Advanced_DataStructure.CodingTask.EnumsClass_Explanation

enum class CoffeeCupSize(val quantity: Int) {
    /** Enum class is something which is fixed.
     *  This had the fixed set of value or functions and these value and function cannot be re-assigned later on.
     */
    MEGA(210) {
        override fun getInfo(): String {
            return "You have ordered $name and contains $quantity ml of coffee"
        }
    },
    LARGE(100) {
        override fun getInfo(): String {
            return "You have ordered $name and contains $quantity ml of coffee"
        }
    },
    MEDIUM(150) {
        override fun getInfo(): String {
            return "You have ordered $name and contains $quantity ml of coffee"
        }
    },
    SMALL(50) {
        override fun getInfo(): String {
            return "You have ordered $name and contains $quantity ml of coffee"
        }
    };

    abstract fun getInfo(): String
}

class Order(val orderSize: CoffeeCupSize)

fun main() {
    val myOrder = Order(CoffeeCupSize.LARGE)
    println(myOrder) //Basic_To_Advanced_DataStructure.CodingTask.EnumsClass_Explanation.Order@5fd0d5ae
    println(myOrder.orderSize) //LARGE
    println(myOrder.orderSize.quantity) //100
    println(myOrder.orderSize.getInfo()) //You have ordered LARGE and contains 100 ml of coffee


    //In when case we don't have to assign else or default value coz we should only have the value which is present in the enum class
    when (myOrder.orderSize) {
        CoffeeCupSize.LARGE -> {

        }
        CoffeeCupSize.MEDIUM -> {

        }
        CoffeeCupSize.SMALL -> {

        }
        CoffeeCupSize.MEGA -> {

        }
    }
}