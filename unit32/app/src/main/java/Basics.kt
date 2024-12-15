fun main() {
    val name = readln()
    val sugarCount = readln().toInt()
    makeCoffee(name, sugarCount)
}

fun makeCoffee(name: String ,sugarCount: Int){
    if(sugarCount == 1){
        println("Coffee with $sugarCount spoon of sugar for $name")
    }else if(sugarCount == 0){
        println("Coffee with no sugar for $name")
    }
    else{
        println("Coffee with $sugarCount spoons of sugar for $name")
    }
}