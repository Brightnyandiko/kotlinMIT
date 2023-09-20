fun main(args: Array<String>) {
    var chr='c'

    when(chr){
        'A','E','I','O','U'-> println("$chr is a vowel")
        else-> println("$chr is a consonant")
    }
    println("Enter a number :")
    var mynum=Integer.valueOf(readln())
    when(mynum){
        in 1..9 -> println("$mynum is a single digit number")
        in 10..99 -> println("$mynum is a double digit number")
        in 100..999 -> println("$mynum is a three digit number")

        else -> println("$mynum has more than three digits")
    }

}