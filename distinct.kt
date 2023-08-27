fun main() {
    val total = listOf(1, 2, 1, 4, 5, 2, 4 ,5, 2, 5, 2, 3)
    val distinct = total.distinct().sorted()

    println(distinct)
}