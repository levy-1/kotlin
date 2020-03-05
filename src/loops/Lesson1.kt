package loops

//for loop
//syntax
fun main(args: Array<String>) {
//    increment by 2
    for (i in 1..20 step 2){
        if (i == 4){
            println("$i is equal to 4")
        }else{
            println("$i is not equal to 4")
            println(i)
        }
    }
//    printing in reverse
    for (i in 20 downTo 1){
        println(i)
    }

// while loop
    var a = 0
    while (a < 10){
        println(a)
        a++
    }
//    do while
    var b = 1
    do{
        println(b)
        b++
    }while (b < 10)











}