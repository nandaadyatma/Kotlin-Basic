//Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik. Ini akan berguna ketika Anda menginginkan tidak ada data yang sama atau duplikasi dalam sebuah collection. Kita bisa mendeklarasikan sebuah Set dengan fungsi setOf.

fun main() {
    val integerSet = setOf(12,42,1,4,11,1,42)
    val integerSet2 = setOf(1, 12,4,11, 42)

    println(integerSet)
    println(integerSet == integerSet2) //urutan gapenting dalam perbanfingan
    println(12 in integerSet)

    //Pada Mutable Set kita bisa menambah dan menghapus item namun tak bisa mengubah nilai seperti pada List.

    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1
}