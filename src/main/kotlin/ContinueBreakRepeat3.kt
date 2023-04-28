fun main() {
    //Continue, Break, Repeat - 3
    //Pedir um número inteiro positivo n e imprimir todos os pares até n exceto 4

    print("Digite um número inteiro positivo: ")
    val n = readln().toInt()

    for(i in 0..n){
        when{
            n < 0 -> break
            i == 4 -> continue
            i % 2 == 0 -> println(i)
        }
    }
}

