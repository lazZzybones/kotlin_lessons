package if_else_for

fun main() {

    for (variable in 1..10){
        println(variable)
    }

    val myArray = arrayOf("Sergey", "Tany", "NAsty")


    //old style
    for (i in myArray){
        println(i)
    }

    //new style
    myArray.forEach {
        println(it)
    }

    for (one in myArray){
        println(one)
        for(two in 1..10){
            println(two)
        }
    }
}