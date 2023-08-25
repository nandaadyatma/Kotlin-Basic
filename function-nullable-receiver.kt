fun main() {
    val value1: Int? = null
    print(value1.slice)
}

val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2)