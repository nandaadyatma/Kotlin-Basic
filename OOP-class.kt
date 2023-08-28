class Animal (val name: String,
              val weight: Double,
              val age: Int,
              val isMammal: Boolean
    ) {
    fun eat(){
        println("$name eats!")
    }

    fun sleep(){
        println("$name sleeps")
    }

    fun desc(){
        println("Name: $name\nWeight: $age\nAge: $age\nMammal: $isMammal")
    }
}

fun main() {
    val tomiTheDog = Animal("Tomi", 15.0, 5, true)
    tomiTheDog.desc()
    tomiTheDog.eat()
    tomiTheDog.sleep()
}