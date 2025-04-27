fun main() {
    val arr1= mutableListOf(0)

    while (true){
        val x = readln().toInt()
        if (x==0){
            break
        }
        arr1.add(x)
    }
        val arr2 = arr1.sortedBy { -it }
        println(arr2[0])
}