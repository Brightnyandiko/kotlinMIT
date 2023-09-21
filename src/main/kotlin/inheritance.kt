open class Parent{

    val dad="like watching news"
    val mum="likes cooking"
}
class Boy:Parent(){
    fun mvulana(){
        println(dad)
    }

}
class Girl:Parent(){
    fun msichana(){
        println(mum)
    }

}

fun main(args: Array<String>) {
    val myobject=Boy()
    myobject.mvulana()
    val myobject2=Girl()
    myobject2.msichana()
}