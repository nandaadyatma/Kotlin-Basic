fun main() {
    fun getFullName(first: String = "Kotlin", middle: String = "is",last: String = "fun"): String{
        return "$first $middle $last"
    }

    val fullName = getFullName(first = "Kadek", middle = "Bobo", last = "Pratama")
    val fullName2 = getFullName(middle = "Ika", last = "Pratiwi", first = "Putu")
    println(fullName)
    println(fullName2)
    println(getFullName())
}