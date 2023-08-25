fun main() {
    val user = DataUser("Agung",24)

    val numberList : List<Int> = listOf(1, 2, 3, 4, 5)

    val anyList = listOf(12, 4, "ayam", null, user)

    print(anyList[4])

    //List bersifat immutable
    //msksk gunakanlah mutableListOf

    val anyList2 = mutableListOf('a', "Kotlin", 3, true)

    anyList2[2] = 23

    print(anyList2[2])
}