//Data user ada di file DataClasses

fun main() {
    val user = DataUser("Aji", 18)
    val user2 = DataUser("Nodo", 24)
    val user3 = user.copy()
    val user4 = user2.copy(age = 200)

    println(user3.name)
    println(user4)
}