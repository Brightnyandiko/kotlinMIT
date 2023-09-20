fun main(args: Array<String>) {

    var majina= arrayOf("erick","joan",45.67,43,'p',false)
    println("My name is ${majina[1]}")
    val myarr= arrayOf<Int>(4,5,7,2,7)

    myarr[1]=1
    println(myarr[1])
    val myarr2=myarr.sorted()
    println(myarr2)
    println("The size of myarr is ${myarr.size}")
    println("The last item of myarr is ${myarr.last()}")
    println(myarr.get(3))


}