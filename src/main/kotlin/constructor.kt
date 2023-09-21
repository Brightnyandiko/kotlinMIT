class Student(val name:String, var age:Int, var gender:String){


}

fun main(args: Array<String>) {
//    create object
    val stu=Student("Bright", 20, "male")
    val stud=Student("Kim", 27, "Female")
    val stude=Student("Sly", 26, "Female")
    val studen=Student("Mark", 23, "Male")
    println("Student name is ${stu.name} and age is ${stu.age} and is also a  ${stu.gender}")
    println("Student name is ${stud.name} and age is ${stud.age} and is also a ${stud.gender}")
    println("Student name is ${stude.name} and age is ${stude.age} and is also a ${stude.gender}")
    println("Student name is ${studen.name} and age is ${studen.age} and is also a ${studen.gender}")
}