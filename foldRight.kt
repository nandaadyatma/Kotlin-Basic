fun main() {

    val numbers = listOf(12,412,1)
    val fold = numbers.foldRight(0){ item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println(fold)
}