//parent class menggunakan keyword open
open class Food(val name: String, val weight: Double, val isVeget: Boolean){
    open fun edible(){
        println("its edible")
    }

    open fun tasty(){
        println("its tasty")
    }
}

class Bread(name: String, weight: Double, isVeget: Boolean, val isSweet: Boolean) : Food(name, weight, isVeget){
    override fun tasty() {
        println("$name is pluffy")
    }
}

fun main() {
    val bread1 = Bread("Croissant", 20.0, true, true)
    bread1.edible()
    bread1.tasty()
}