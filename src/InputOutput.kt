import java.util.Scanner
fun main(args: Array<String>) {
    print("Please type a word here:")
    var enteredString = readLine()
    println("You have typed $enteredString")

    print("Please write any number: ")
    var anyNumber = Integer.valueOf(readLine())
    println("You have entered number $anyNumber")

    var read = Scanner(System.`in`)
    print("Please enter an integer number: ")
    var integerNumber = read.nextInt()
    println("This is the number entered: $integerNumber")


    print("Enter a float number")
    var floatNumber = read.nextFloat()
    println("This is the float number entered: $floatNumber")
}