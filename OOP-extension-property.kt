class Bag(var name: String, var brand: String, var weight: Double)

val Bag.getBagInfo: String
    get() = "Nama tas ini ${this.name} dengan merk ${this.brand} memiliki berat ${this.weight} gram"

fun main() {
    val bag1 = Bag("Alexa 1", "Eiger", 250.9)
    println(bag1.getBagInfo)
}