var message = "Kotlin"

fun main() {
    println(::message.name) //name mendapatkan nama property (namanya "message)
    println(::message.get())

    ::message.set("Kotlin Academy") //bisa di set karena message mutable (var)

    println(::message.get())
}