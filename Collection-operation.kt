fun main() {
    //Filter
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }
    val notEvenList = numberList.filterNot { it % 2 == 0 }

    println(evenList)
    println(notEvenList)

    //Map
    val multipliedBy5 = numberList.map { it * 5 }
    println(multipliedBy5)

    //Count
    println(numberList.count())

    println(numberList.count { it % 3 == 0 }) //menghitung jumlah item yang kelipatan 3

    //find(), firstOrNull(), LastOrNull()
    val firstOddnumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull {it % 2 == 0}
    val lastOrNullNumber = numberList.lastOrNull {it % 2 == 1}
    println(firstOddnumber)
    println(firstOrNullNumber)
    println(lastOrNullNumber)

    //sum
    println(numberList.sum())

    //sorted
    println("sorted number is " + numberList.sorted())
    println("Descending : " + numberList.sortedDescending())

}