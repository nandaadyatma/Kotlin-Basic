fun main() {
    fun factorial(n: Int): Int{
        return if (n == 1 || n == 0) {
            1
        } else {
            n * factorial(n - 1)
        }
    }

    println(factorial(5))
}