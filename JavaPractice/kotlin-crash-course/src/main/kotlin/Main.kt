//val is immutable
//val x: Int 3

//variable with type declaration:
//var x: Int = 3

//also don't need type declaration:
//    val wholeNumber = 4
//    val bigNumber = 3L
//    val preciseDecimal = 3.33
//    val decimal = 3.33f
//    val iLoveVegetables = false
//    val iLovePizza = true
//    val iAmALetter = 'a'

//    val x = 3 * 4
//    val z = 3f / 4f
//    val y = 10 % 3
//    println("The dollar of x is $x")
//    println("The dollar of z is $z")
//    println("The dollar of y is $y")
//
//    val amIAnAdult = true
//    val amIAProgrammer = true
//    val amIAnAdultProgrammer = !(amIAnAdult != amIAProgrammer)
//    println(amIAnAdultProgrammer)
//
//    val string = "Kotlin is the best language"
//    println(string.toUpperCase())

//if conditions
//    val x = 1 + 2
//    if(x ==2){
//        println("x is 2")
//    } else if(x == 3){
//        println("x is 3")
//    } else {
//        println("x is not 2 or 3")
//    }

//    val number1 = readLine() ?: "0"
////    val number2 = readLine() ?: "0"
////    val result = number1.toInt() + number2.toInt()
////    println(result)
//    val shoppingList = mutableListOf<String>("Lambo", "Penthouse", "Rolex")
//    shoppingList.add("Ferrari")
//    //println(shoppingList[3])
//
//    var counter = 0
////    while(counter < shoppingList.size){
////        println(shoppingList[counter])
////        counter++
////    }
//
//    for(shoppingItem in shoppingList){
//        println(shoppingItem)
//    }
//
////    for(i in 1..shoppingList.size){
////        println(i)
////    }
//    val x = 3
//    when(x){
//        in 1..2 -> println("x is between 1 and 2")
//        in 3..10 -> println("x is between 3 and 10")
//        else -> {
//            println("x is not in range")
//        }
//    }
fun main() {

print10Numbers()



}

fun print10Numbers(){
    for(i in 1..10){
        println(i)
    }
}