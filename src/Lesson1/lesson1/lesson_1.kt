package Lesson1.lesson1
//kotlin code ets executed/run only in main()
//main() function defines where kotlin ode gets executed
//the {} defines the scope of your executable code
fun main() {
//    println():prints the content with a new line at the end
//    print() :prints content with continuos line
    println("hello world")
    println("ron")
    print("hello wold")
    print("hello wold")
    print("hello wold")
    println()
//    explicitly defining th type of variables


    val country :String="kenya"//CONSTANT
    var county :String="nairobi"
    var age :Int = 23
    var gender :String
    gender = "Male"

    county="ug"
    println(country)
    println(county)
    println(age)
//    implicitly defining th type of variables
    val name ="john doe"
    var language ="kotlin"
    println(name)
    println(language)

//  kotlin datatypes
//    1.Numbers
//        1.1 Integers:non decimal numbers
            var my_age: Int = 23
    println(my_age)
    my_age=my_age + 10
    println(my_age)
//        1.2 floats :integers:decimal numbers
        val height = 3.56f
    println(height)
//    2.Booleans:state true or false
    val isloggedin: Boolean = true
    val isloggedout: Boolean = false

//    3.strings
    var length:Int = 25
    var ruler:String ="oxford"
    println("The length of the " +   ruler   + " ruler is " + length + "cm")
    println("The length of the  $ruler ruler is $length cm")
    println()
//    4.Characters:declared using single quotes
    val first_letter = 'j'

//    assignment
//    create two variables num1 and num2 each storing 10 and 20 respectively and calculate the sum of the two numbers
    val num1 : Int =10
    val num2 : Int = 20
    println(num1 + num2)
//    5.arrays
//


}

