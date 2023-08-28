//dua atau lebih fungsi dengan nama yang sama disebut dengan overloading. Overloading dapat dilakukan selama fungsi itu memiliki parameter yang berbeda.
class Fish(private var name: String){
    fun eat(){
        println("$name makan")
    }

    fun eat(typeFood: String){
        println("$name makan $typeFood")
    }

    fun eat(typeFood: String, quantity: Double){
        println("$name makan $typeFood sebanyak $quantity")
    }

    fun sleep(){
        println("$name tidur!")
    }


}

fun main() {
    val gurami = Fish("Gurami")
    gurami.eat()
    gurami.eat("makanan apapun")
    gurami.eat("makanan apapun", 15.0)
    gurami.sleep()
}