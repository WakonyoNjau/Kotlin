fun main(args: Array<String>) {
    var age: Int
    age = 17
    if (age<20){
        println("Sorry, $age is below the target range")
}else{
    println("Your $age is above the target range and you qualify")

    }
    var number:Int
    number = 5
    if(number==1){
        println("Oops, you lost the guess")
    }else if(number==2){
        println("Oops, you almost got it right")
    }else if(number==3){
        println("Wow, Congratulations, you won")
    } else if(number==4){
        println("Oops, you went a step further")
    }else if(number==5){
        println("Oops, you went a little bit overboard")
    }
    else {
        println("$number is not valid. Please enter again")
    }

//    WHEN STATEMENT
    var y:Int
    y = 0
    when(y){
        1 -> println("Oops, you lost the game")
        2 -> println("Oops, you almost got it right")
        3 -> println("Wow, Congratulations")
        else -> println("$y is not valid. Please try again")
    }

    var height:Double
    var weight:Int
    height = 1.5
    weight = 78
    var BMI = (weight/(height*height))
    println(BMI)
//   if (BMI<18) {
//       println("You are underweight")
//   }else if (BMI in 18 .. 25){
//       println("You are average")
//   }else if (BMI in 25..30){
//       println("You are overweight")
//   }else if(BMI> 30){
//       println("You are obese")
//   }
//




   }
