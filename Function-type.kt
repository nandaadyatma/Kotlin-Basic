//Pada sub-modul selanjutnya, kita akan belajar tentang lambda dan higher-order function, namun sebelum itu kita perlu tahu terlebih dahulu apa itu function type. Seperti namanya, Anda dapat membuat sebuah fungsi menjadi tipe data. Menarik kan?
//
//Kotlin sendiri menggunakan function type untuk tipe deklarasi yang berhubungan dengan sebuah fungsi. Dalam penggunaannya, terdapat beberapa tanda yang berhubungan dengan sebuah fungsi seperti jumlah dan tipe parameter serta tipe kembalian.

typealias Arithmetic = (Int, Int) -> Int

val sum: Arithmetic = { valueA, valueB -> valueA + valueB}

val multiply: Arithmetic = {valueA, valueB -> valueA * valueB}

val sumResult = sum(10, 10)
val multiplyResult = multiply(20, 20)

fun main() {
    println(sumResult)
    println(multiplyResult)
}