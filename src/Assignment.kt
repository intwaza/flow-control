fun main() {
    println(isEven(3))
    println(cons("banana"))
    println(even(arrayOf("Belyse","Anna","Celine")))
    var product= Product("Belyse",60.0,200,"VIP")
    product("mango")

}
fun isEven(number:Int):Boolean{
    if(number%2==0){
        return true
    }
    else{
        return false
    }
}
data class Product(var name:String,var weight:Double,var price:Int,var category:String){
}
fun product(item:String){
    listOf<String>("grocery")
    listOf<String>("hygiene")
    listOf<String>("others")

    when (item){
        "grocery"-> listOf("grocery")
        "hygiene"-> listOf("hygiene")
        else-> listOf("others")
    }
}
fun cons(word:String):String{
    var a=""
    for (char in word){
        if (word.indexOf(char)%2==0){
            print(a.plus(char))
        }
    }
    return "${a} "
}
fun even(letter:Array<String>): String {
    var answer = ""

    for (words in letter){
        if (words.length%2==0){
            print(answer.plus(words))
        }
    }
    return answer
}