fun main() {
    //Strings - 3
    print("Digite uma frase para filtrar as vogais: ")
    val str = readln()

    for(char in str){
        if(char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u') print(char)
    }
}