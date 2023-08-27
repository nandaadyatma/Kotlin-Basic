import java.lang.IllegalArgumentException

fun setWord(message: String){
    fun printMessage(){
        println(message)
    }

    printMessage()
}

fun sum(valueA: Int, valueB: Int, valueC: Int): Int{
    fun validateNumber(value: Int){
        if (value == 0){
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueB)

    return valueB + valueA + valueC
}
fun main() {




    setWord("Omaagaaaa")

    print(sum(12,4,2))

}