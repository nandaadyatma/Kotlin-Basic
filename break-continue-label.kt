fun main() {


    loop@ for (j in 1..10){
        println("outsideloop")
        for (i in 1..10){
            println("insideloop $i")
            if(i == 8) break@loop
        }
    }
}