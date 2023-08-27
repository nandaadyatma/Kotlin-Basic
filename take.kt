fun main() {
    val number = 1..20
    val oddNumber = number.filter { it % 2 == 1 }
    val take = oddNumber.take(5)
    val takeLast = oddNumber.takeLast(5)

    println(take)
    println(takeLast)
}