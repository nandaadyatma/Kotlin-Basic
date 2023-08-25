fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    val groupColor: Array<Color> = Color.values()

    for (color in groupColor){
        print("${color.value.toString(16)} \n")
    }

    print(Color.GREEN.ordinal) //ordinal use to get object index in enum
}

enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN( 0x00FF00),
    BLUE(0X0000FF)
}