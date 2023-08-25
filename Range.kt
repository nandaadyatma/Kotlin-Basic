fun main() {
    val rangeAman = 75..100
    val DeretBeda2 = 1..25 step 2

    println(rangeAman.step) //ini untuk mendapatkan nilai step yang digunakan (dimana default step range adalah 1)
    println(DeretBeda2.step)

    for (range in rangeAman){
        println(range)
    }

    for (elemen in DeretBeda2){
        println(elemen)
    }
}





