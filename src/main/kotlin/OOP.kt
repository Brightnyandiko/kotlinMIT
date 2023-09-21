class Example{

    //data member
    private var number:Int=5

    //member function
    fun calculatesquare():Int{

        return number*number
    }
}

fun main(args: Array<String>) {
    //creating an object of example class

    val myobj=Example()
    println("the square is ${myobj.calculatesquare()}")



}