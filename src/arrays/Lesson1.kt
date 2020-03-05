package arrays

//Array is a collection of similar data types either of Int,String etc.Array in kotlin is
//mutable in nature with fixed size which means we can perform both read and write operation on elements of array
//You can declare an array explicitly and implicitly
fun main(args: Array<String>) {


//Declaring an array implicitly
    val country = "kenya"//array declaration implicit dec
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val names = arrayOf("john", "mary", "paul", "mike")
//Declaring an array explicitly
    val county: String = "nai"//array declaration explicit dec
    val nums = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7, 8)
    val majina = arrayOf<String>("john", "mary", "joe", "mike")

    //Accessing array items
    //1.use index numbers
    println(numbers[0])
    //2.use get(), takes the index number as an argument
    println(majina.get(2))

//    creating an array using factory functions
    val cars = intArrayOf(1,3,5,6,7,9,5)
    val isTrue = booleanArrayOf(true,false)

//    changing array values:use set() method
//    set() method takes two argument:one is the index of the value you want
//    to change,the other arg is the value to replace with
    majina.set(1,"konny")
    println(majina.get(1))

    val num_names:Int = majina.size
    println(num_names)

//    Looping through an array
    for (i in 0..num_names-1){
        println(majina.get(i))
        println(majina[i])
    }
    println(majina[1].length)//length function:returns number of characters in a string
    if (majina[1].length < 3){
        println("jack")
    }else{
        println("hello world")
    }










}