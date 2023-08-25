//it's quite same like switch case

fun main() {
    val pilihan: Int

    pilihan = 2

    val mark = 90
    val rangeRemedial = 0..69

    val val2: Any = "sds"

    when(pilihan){
        1 -> println("pilihan kamu adalah 1")
        2 -> println("pilihan kamu adalah 2")
        3 -> println("pilihan kamu adalah 3")
        else -> println("pilihan tidak ada diantar 1,2,3")
    }

    when(mark){
        in rangeRemedial -> println("Maaf nilai anda tidak mencukupi untuk lulus")
        in 70..100 -> {
            println("Selamat kamu memang mantap, kamu lolos cuy")
        }
        else -> {"Nilai kamu tidak valid"}

    }

    when(val2){
        is Int -> println("Nilai val2 adalah Integer")
        else -> println("Nilai val2 is not Integer")
    }
}