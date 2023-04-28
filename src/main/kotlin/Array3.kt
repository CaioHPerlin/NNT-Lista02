fun main() {
    //array frutas
    val arr = arrayOf("banana", "maçã", "ameixa", "pêssego", "melancia", "pêra", "abacaxi", "abacate", "açaí", "pitaia")

    for(fruit in arr){
        if(fruit[0].lowercase() == "a"){
            print("$fruit ")
        }
    }
}