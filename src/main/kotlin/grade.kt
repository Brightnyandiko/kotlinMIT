fun main(args: Array<String>) {

    println("Enter marks :")
    val input= readln()
    if (input != null){
        val score=input.toIntOrNull()
        if (score != null){
            val grade= if (score in 80..100){
                "A"
            }else if (score in 70..80){
                "B"
            }else if (score in 60..70){
                "C"
            }else if (score in 50..60){
                "D"
            }else if (score in 0..50){
                "fail"
            }else if (score > 100){
                "invalid input"
            }else {
                "invalid input"
            }
            println("Score : $score")
            println("Grade : $grade")
        }else{
            println("invalid input")
        }
    }else{
        println("input not provided")
    }

}