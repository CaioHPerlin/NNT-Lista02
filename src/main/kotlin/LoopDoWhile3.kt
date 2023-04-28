fun main() {
    //Loop Do-While - 3
    //Pedir um número até que o usuário digite um número negativo
    val jackpot = (0..10).random()
    println("Um número de 1 a 10 foi sorteado! Tente acertá-lo, mortal!")
    var counter = 1
    do {
        print("Tentativa número $counter:")
        val number = readln().toInt()
        counter++
    }while (number != jackpot)
    print("Maldito! Você me derrotou!")
}