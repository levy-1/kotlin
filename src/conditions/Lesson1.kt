package conditions

fun main(args: Array<String>) {
    val x :Int = 3
    val y:Int = 5

//1.if
    if (x < y){
        println("$x is less than $y")
    }
//2.if..else..
    if (x > y){
        println("$x is greater than $y")
    }else{
        println("$x is less than $y")
    }
//3.if..else if...else
    if (x < y){
        println("$x is greater than $y")
    }else if (y >= 5){
        println("$y is greater than or equal to 5")
    }else{
        println("closing the program")
    }

// if statement as an expression
    val results =  if (x == 3){
        println("$x is equals to 3")
    }else if (y >= 5){
        println("$y is greater than or equal to 5")
    }else{
        println("reults")
    }
    println(results)
//    when  statement
//    when(state){
//        state1 -> println("hello world")
//        state2 -> println("hello world")
//        state3 -> println("hello world")
//        state4 -> println("hello world")
//    }
    println("Enter your age : ")
    val myAge :String = readLine()!!//ask user to enter age
//    val age:Int = 17
    var age_as_int:Int = myAge.toInt()
    when(age_as_int){
        12 -> println("join class 6")
        13 -> println("join class 7")
        14 -> println("join class 8")
        15 -> println("join FORM ONE")
        17 -> println("GETTING AN ID SOON")
    }
    println("welcome to my age app")
    println("please enter yur age")

    val miaka :String = readLine()!!
    var miaka_kama_Int = miaka.toInt()
    when(miaka_kama_Int) {
        0 -> println("your age s even")
        1 -> println("your age is odd")

    }



}
