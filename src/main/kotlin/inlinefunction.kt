fun main(args: Array<String>) {

    //inline function
    val sum={num1:Int, num2:Int -> num1 + num2}

    println("20 + 30 = ${sum(20,30)}")

    val fullnames={fname:String, lname:String -> fname + lname}
    println("my name is ${fullnames("Bright", "Nyandiko")}")


}

