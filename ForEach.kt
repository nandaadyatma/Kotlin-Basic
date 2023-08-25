fun main() {
    val ranges = 1..20
    ranges.forEach { value -> //harus pake value
        println("value is $value")
    }

    ranges.forEachIndexed() { index,value -> //harus pake value
        println("value is $value with index $index")
    }
}