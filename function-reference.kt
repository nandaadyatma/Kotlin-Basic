import com.sun.org.apache.xpath.internal.operations.Bool

fun main() {
    val numbers = 1..10
    val evenNumbers = numbers.filter(::isEvenNumber)

    for (number in evenNumbers){
        println(number)
    }

    val oddNumbers = numbers.filter(Int::isOddNumber)

    for (number in oddNumbers){
        println(number)
    }
}

fun isEvenNumber(number: Int) = number % 2 == 0

fun Int.isOddNumber(): Boolean {
    return this % 2 == 1
}