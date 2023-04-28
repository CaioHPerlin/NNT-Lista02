fun main() {
    //array 10 numeros random
    val arr = IntArray(10)
    for(n in 0 until arr.size-1) arr[n] = (-10..10).random()
    println(arr.contentToString())
}