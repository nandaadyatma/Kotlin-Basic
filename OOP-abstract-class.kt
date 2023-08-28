
//abstract merupakan gambaran umum dari sebuah kelas. Ia tidak dapat direalisasikan dalam sebuah objek. Secara harfiah hewan merupakan sebuah sifat. Kita tidak tahu bagaimana objek hewan tersebut. Kita tahu bentuk kucing, ikan dan ular seperti apa tetapi tidak untuk hewan. Maka dari itu konsep abstract class perlu diterapkan agar kelas Animal tidak dapat direalisasikan dalam bentuk objek namun tetap dapat menurunkan sifatnya kepada child class-nya.

open abstract class Hewan(var name: String, var weight: Double, var age: Int, var isCarnivora: Boolean){
    open fun eat(){
        println("$name sedang makan")
    }

    open fun sleep(){
        println("$name sedang tidur !")
    }
}

//class Anjing(var name: String, var weight: Double, var age: Int, var isCarnivora: Boolean) : Hewan(name, weight, age, isCarnivora)
//fun main() {
//    val anjing = Anjing("Anjing", 15.0, true)
//}