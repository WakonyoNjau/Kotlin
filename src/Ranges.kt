fun main(args: Array<String>) {
    println("Number Range:")


    for (num in 1..5){
        println(num)
    }
    println("Character Range:")

    for (char in 'A'..'E')
        println(char)

//    Using rageTo() instead of '..'
    var number = 1.rangeTo(5)
    println("rangeTo:")
    for(x in number){
        println(x)
    }
//    Using downTo () instead of '..'
    var namba = 10.downTo(1)
    println("Down to:")
    for (y in namba){
        println(y)
    }

//
//    Declaring step values other than default
    var num1 = 1.rangeTo(10)
    var oddNumber = num1.step(3)
    for(n in oddNumber) {
        println(n)
    }

//    Checking values in a range
    val OneToSix = 1..6
    println("3 in OneToSix: ${3 in OneToSix}")
    println("7 in OneToSix: ${7 in OneToSix}")


}