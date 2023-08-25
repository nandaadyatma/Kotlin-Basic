fun main() {
    10.printValue()

    val num1 = 90
    num1.printValue()

}

fun Int.printValue(){
    println("value is: $this")
}