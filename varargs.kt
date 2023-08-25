fun main() {
    val number = sumNumbers(12,32,42,41,2)
    println(number)
    val size = getSize(12,32,42,41,2)
    println(size)
}

fun sumNumbers(vararg number: Int): Int{
    return number.sum()
}

fun getSize(vararg number: Int): Int{
    return  number.size
}