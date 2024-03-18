fun main(args: Array<String>) {

    for (n in 1..10){
        println("before continue, loop: $n")

        if (n==2||n==5)
            continue
        println("after continue, loop: $n")
    }

    for (m in 1..5){
        println("before break, loop: $m")
        if(m==3)
            println("I am terminating the loop...")
            break
    }

    for (x in 'A'..'Z')
        println("before break, loop: $x")
        val x = null
        val p = null
        if(x==p)
            println("I am terminating the loop...")



    }













