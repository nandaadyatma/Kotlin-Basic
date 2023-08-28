class Plant(name: String, weight: Double, age: Int, isFruiting: Boolean){
    val name: String
    val weight: Double
    val age: Int
    val isFruiting: Boolean

    //init block memungkinkan kita untuk menuliskan properti di dalam body class ketika kita menggunakan primary constructor. satu fungsi lainnya adalah untuk membantu dalam memvalidasi sebuah nilai properti sebelum diinisialisasi.
    init{
        this.name = name
        this.weight = if(weight <= 0.1) 0.1 else weight
        this.age = if (age < 0 ) 0 else age
        this.isFruiting = isFruiting
    }
}

fun main() {
    val anggrek = Plant("Anggrek", 50.0, 2, false)
    print("${ anggrek.name } is ${anggrek.age} years old")
}