class Animal2{
    var name: String = "Miauu"
        get() {
            println("getter function is called")
            return field
        }

        set(value) {
            println("setter function is called")
            field = value
        }
}

fun main() {
    val dicodingCat = Animal2()
    println(dicodingCat.name)
    dicodingCat.name = "meooow"
    println(dicodingCat.name)
}