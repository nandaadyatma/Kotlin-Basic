//menyaring dan mengambil item pada posisi indeks tertentu

fun main() {
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(2..6) //2 ini indeks ya, nilai item indeks 2 adalah 3
    val slice2 = total.slice(0..9 step 2)

    println(slice)
    println(slice2)
}