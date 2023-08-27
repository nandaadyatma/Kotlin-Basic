fun main() {
    val message = "Hello Kotlin"
    val result = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }
}