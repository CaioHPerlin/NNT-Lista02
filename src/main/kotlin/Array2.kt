fun main() {
    //array 10 int from readln
    //avg
    val arr = IntArray(10)
    var n = 0
    while (n < arr.size){
        print("Array[${n}]: ")
        arr[n] = readln().toInt()
        n++
    }
    println("Array gerado: ${arr.contentToString()}")
    println("Média dos valores: ${arr.average()}")
}