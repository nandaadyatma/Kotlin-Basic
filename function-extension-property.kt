fun main() {
    println(10.slice)
}

val Int.slice: Int
    get() = this.div(2)