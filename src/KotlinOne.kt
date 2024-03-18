fun main(args: Array<String>) {
//    INTEGER
//    STRING- a group of characters(text)
//    DOUBLE - decimal no.
//    CHAR
//    BOOLEAN - a true or false
    var x: Int
    var y: String
    var z: Double
    var a: Char
    var b: Boolean
    var f = 34
    var d = 16
    var answer = f + d
    var s = 6
    var t = 4
    var answer1 = s * t

    x = 10
    y = "This is my first Kotlin"
    z = 30.23
    a = 'w'
    b = true

    println(x + z)
    println(f + d)
    println("Your summation output is "+answer)
    println(s * t)
    println("Your multiplication output is $answer1")

    val r: Int
    val p: String
    val q: Double

    r = 34
    p = "This is my variable"
    q = 24.5
    var j = r+q

    println("This is my output" +j)
//        var - Dynamic. you can change the values eg when giving a similar variable r a different value other than 34
//    val - static. Variable cannot be changed

}