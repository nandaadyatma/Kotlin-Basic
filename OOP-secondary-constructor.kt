
class Book(name: String, weight: Double){
    val name: String
    var pages: Int
    val weight: Double

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.name = name
        this.pages = 10
    }

    constructor(name: String, weight: Double, pages: Int) : this(name,weight) {
        this.pages = pages}
}

fun main() {
    val book1 = Book("Laskar Pelangi", 250.0, )
}