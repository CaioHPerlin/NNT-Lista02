fun main() {
    //Continue, Break, Repeat - 2
    //Pedir um número até que o usuário digite um número negativo
    while(true){
        print("Digite um número:")
        val n = readln().toInt()
        if(n < 0){
            println("Eca! Número negativo!")
            break
        }
    }
}

