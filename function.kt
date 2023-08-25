fun main() {
    val UserName = "Arya"
    val Age: Int = 10

    fun Greeting(name: String, Age: Int):String{
        return "My name is $name, I am $Age years old, nice to meet you"
    }

    println(Greeting(UserName, Age))
}