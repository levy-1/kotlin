package functions


// a block of that has specific task e.g println()
//fun nameOfFunction(){
//  code to execute
//}
fun greetings1(){
    println("hello world")
}
//functions that take an argument
//parameter:a variable passed into a function during a function
fun greetings2(name:String){
    println("hello $name")

}
fun greetings3(name:String,age:Int){
    println("hi am $name, am $age years old")

}


fun main(args: Array<String>) {
//    to call a function use greetings1()
//    Must be iin the main function
    greetings1()
    println("Hello once again")
    greetings2("john")//"john is an argument"
    greetings3("john",23)//"john is an argument"

    fun countcha(name: String){
        val x = name.length
                println(x)
    }
    
    fun volume(radius:Int, height:Int){
        val p : float = 3.142f
        val volume = p *height *radius* radius
        println("volume is $volume")
    }







}