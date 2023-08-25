fun main() {
    val Up10 = 1.rangeTo(10)
    val Down10 = 10.downTo(1)

    val rangeChar = 'A'.rangeTo('F') //A,B,C,D,E,F

    for (element in Up10){
        println(element)
    }

    println("\n")

    for (element in Down10){
        println(element)
    }

    if(8 in Up10) println("Iya 8 ada di dalam range 1-10")

    //println(Up10[4])
}