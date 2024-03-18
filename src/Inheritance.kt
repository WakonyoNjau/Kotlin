fun main(args: Array<String>) {
    val child1 = Child()
    child1.myfunction()

    val dog1 = Dog("Black",5)
    dog1.woof()

    val cow1 = Cow("Brown", 10)
    cow1.moos()

}

open class Parent{
    val x = 5
}

class Child: Parent(){
      fun myfunction(){
          println(x)
      }
  }


open class Animal(var color: String, var age: Int){
    init{
        println("Color is: $color")
        println("Age is: $age")
    }
}
class Dog( color: String,  age: Int): Animal(color, age){
    fun woof(){
        println("Dog makes sound of woof")
    }
}

class Cat(color: String, age: Int): Animal(color,age){
    fun meow(){
        println("The cat makes the sound of meow")
    }
}

class Cow(color: String, age: Int): Animal(color, age){
    fun moos(){
        println("A cow moos")
    }
}