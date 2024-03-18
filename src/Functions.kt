fun main(args: Array<String>) {
    println(birthdayGreeting(name = "", 13, "Felister"))
    println(birthdayGreeting(name = "Alex", 32, "Martha"))
    println(birthdayGreeting(name = "Mercy", 17, "Ethan"))
    println(birthdayGreeting(name = "Nelly", 18, "Elena"))


//    println(RectangeleArea( width = 32, length = 18, area = z))
//    println(RectangeleArea( width = 4, length = 6, area = z))

    println(calculateArea(length = 12.4, width = 45.5))
    println(calculateArea(length = 10.2, width = 21.3))
    println(calculateArea())
    println(calculateArea(12.1))
    println(calculateArea(width = 10.0))
    println(calculateCircleArea(10.0))


    println(calculateBMI())






}

 fun birthdayGreeting(name: String="John", age: Int, firstname: String): String{
    val a = "Happy birthday $name"
    val b = "You are now $age years old"
    val c = "You are celebrated"
    val d = "Regards from $firstname"
    return "$a\n$b\n$c\n$d"

}


//
//val x = 32
//val y = 18
//val z = x*y

//
//fun RectangeleArea(length: Int, width: Int,area: Int ): String {
//    val x = "The width is $width"
//    val y = "The length is $length"
//    val z = "The total area is $area"
//    return "$x\n$y\n$z"
//}


//solution
fun calculateArea(length: Double=10.2, width: Double=5.3): Double{
    return length * width

}

fun calculateCircleArea(radius: Double, pi: Double=3.14): Double{
    return pi*radius*radius

}


fun calculateBMI(height: Double=2.0, weight: Double=60.0): Double{
    return weight/(height*height)
}