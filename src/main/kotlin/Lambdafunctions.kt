fun main(args: Array<String>) {

    val myLambda: (Int) -> Unit= {s: Int -> println(s) } //lambda function
    multiplyNumber(5,10,myLambda)
}
fun multiplyNumber(a: Int, b: Int, mylambda: (Int) -> Unit ){   //high level function lambda as parameter
    val multiply = a * b
    mylambda(multiply) // println(add)
}