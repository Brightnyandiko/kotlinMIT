class Fruits {

    var type=""
    var colour=""
    var price=0

}

fun main(args: Array<String>) {
    //create object

    val myobject=Fruits()
    val myobject2=Fruits()
    myobject.type="banana"
    myobject.colour="yellow"
    myobject.price=20

    myobject2.type="apple"
    myobject2.colour="green"
    myobject2.price=30
    println("my favourite food is ${myobject.type} and it's ${myobject.colour} and it costs ${myobject.price} shillins")
    println("my favourite food is ${myobject2.type} and it's ${myobject2.colour} and it costs ${myobject2.price} shillins")
}