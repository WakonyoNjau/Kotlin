fun main(args: Array<String>) {
//    Containers that hold data sets
    var arr = arrayOf(10, "Faith", 23.4, 'A')
    var arr1 = arrayOf<Int>(12,232,343,545)
    var arr2 = arrayOf<String>("John", "Kube","Esther")
    println(arr[1])
    println(arr[3])
    println(arr2[2])
    println(arr1[2])


//    modify an array using set function
    var fruits = arrayOf("banana", "Oranges", "Apples")
    fruits.set(1, "Pineapple")
    fruits[0] = "Tomato"
    for(fruit in fruits){
        println(fruit)
    }

//    Using get function to fetch a value form an array
    var car = arrayOf("Benz", "Lambo", "Toyota", "Honda")
    println(car.get(0))





}
