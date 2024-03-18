fun main(args: Array<String>) {
    val car1 = Car("Vitz", "Toyota", 2010)
//    car1.brand = "Vitz"
//    car1.model = "Toyota"
//    car1.year = 2010
    println(car1.brand)
//    println(car1.model)
//    println(car1.year)

    val car2 = Car("Ford", "Mustang", 1920)
//    car2.brand = "Ford"
//    car2.model = "Mustang"
//    car2.year = 1920
    println(car2.model)
//    println(car2.model)
//    println(car2.year)
//    lamp class objects
    val lamp1 = Lamp()
    lamp1.turnOff()
    println(lamp1.displayLightStatus("lamp1"))
    lamp1.turnOn()
    println(lamp1.displayLightStatus("lamp1"))

    val lamp2 = Lamp()
    lamp2.turnoff()
    println(lamp2.displayLightStatus("lamp2"))

    lamp2.turnon()
    println(lamp2.displayLightStatus("lamp2"))


    val person1 = Person("Alex", 23)
    val person2 = Person("Melly", 17)
    person1.canVote(23)
    person2.canVote(17)

}

class Car(var brand: String, var model: String, var year: Int) {
//    body of the class:
//    data variables
//    var brand = ""
//    var model = ""
//    var year = 0
//    member functions(methods)
}

class Lamp{
    var isOn: Boolean = false

    fun turnOff(){
        isOn = false
    }
     fun turnOn(){
         isOn = true

     }
class lamp{
    var ison: Boolean = false
     }
     fun turnon(){
         isOn = false
     }
    fun turnoff(){
        isOn = true
    }
    fun displayLightStatus(lamp: String){
        if (isOn==true){
            println("$lamp is on")
        }else{
            println("$lamp is off")
        }
        }
    }

class Person(var name: String, var age: Int){
    fun canVote(age: Int){
        if (age<18){
            println("Cannot vote")
        }else{
            println("Can vote")
        }

    }

}