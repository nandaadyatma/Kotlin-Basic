fun main() {
    val num: Int? = 5
    val result = num?.slice ?: 0
    println(result)
}