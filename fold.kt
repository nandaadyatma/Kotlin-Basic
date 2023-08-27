fun main() {
    val number = listOf(23, 13, 58)

    val fold = number.fold(5){ current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("result $fold")


}