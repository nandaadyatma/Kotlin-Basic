// Expression must have return value
// beside statement dont have a return value



fun main() {
    val val1 = 55
    val val2 = 53
    //Expression in if
    val conclusion = if (val1 > val2 * 2) "val1 greater than val2" else "val1 is smaller than val2"

    println(conclusion)

    print("\n\n")

    //Statement in if
    if (val1 > val2){
        println("val1 greater than val2")
    }
    else {
        println("val 1 is smaller than val2")
    }
}