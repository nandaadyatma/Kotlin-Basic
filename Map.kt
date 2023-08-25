
//Turunan yang ketiga adalah Map, yakni sebuah collection yang dapat menyimpan data dengan format key-value
fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"

    )
    println(capital["Jakarta"])
    println(capital.keys)
    println(capital.values)

    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    println(mutableCapital)
}