fun main() {
    val text = "hello"
    val result = text.run {
        val from = this
        val to = this.replace("hello","kotlin")
        "replace text from $from to $to"
    }
    println("result: $result")
}