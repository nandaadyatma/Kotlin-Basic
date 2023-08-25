fun main() {
    var arr1: IntArray = intArrayOf(23,24,2,33,1)
    var temp: Int

    for (i in 0..arr1.size-2){
        for (j in 0..arr1.size-2-i){
            if (arr1[j] > arr1[j+1]){
                temp = arr1[j]
                arr1[j] = arr1[j+1]
                arr1[j+1] = temp
            }
        }
    }

    for (a in arr1){
        println(a)
    }
}

