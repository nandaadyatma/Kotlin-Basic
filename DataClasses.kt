class User(val name: String, val age: Int){

    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataUser(val name: String, val age: Int)

fun main() {
    val user = User("Arif", 15)
    val dataUser1 = DataUser("Aris", 24)
    val dataUser2 = DataUser("Aris", 24)
    val dataUser3 = DataUser("Joko", 24)

    println(user)
    println(user) //mencetak alamat objek

    print("\n\n")
    println(dataUser1.equals(dataUser2))
    println(dataUser1.equals(dataUser3))

    println()
}