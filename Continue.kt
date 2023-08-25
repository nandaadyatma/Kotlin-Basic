fun main() {
    val arr1 = listOf(23,41,23,null,34,null,32)

    for (value in arr1){
        if (value == null){
            continue
        }
        println(value)
    }
}