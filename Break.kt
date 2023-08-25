fun main() {
    val arrInt = listOf(1,2,3,null,5,null,7)

    for (value in arrInt){
        if (value == null){break}
        println(value)
    }
}