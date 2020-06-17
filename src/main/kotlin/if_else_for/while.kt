package if_else_for

import java.lang.Thread.sleep

fun main() {
    var susStatus = "inactive"

    while (susStatus.equals("inactive")) {
        println(susStatus)
        susStatus = "active"
    }

    println(susStatus)

    var countSite = 0

    while (countSite < 10){
        sleep(1000)
        println("new user")
        countSite += 1
        println(countSite)
    }

    var sec = 5
    var tries = 0

    while (tries < sec){
        tries += 1
        println(tries)
        if (getSubStatus()== "active"){
            return
        }
        sleep(1000) // 1sec
    }

    for (tryy in 1..5){
        if (getSubStatus() == "active"){
            return
        }
        sleep(1000) // 1sec
    }

    val word = "Book"
    var currentWord = ""

    val myArray = arrayOf("Table", "Apple", "Book")

    var elementIndex = 0

    while (currentWord != word){
        currentWord = myArray[elementIndex] //1
        elementIndex += 1 //2
        continue //3
        println(currentWord) //4
    }

    while (true){
        currentWord = myArray[elementIndex]
        elementIndex += 1
        if (currentWord == "Book"){
            println("Finish")
            println(currentWord)
            return
        }else{
            println("Next Step")
            continue
        }
    }

    do{
        println("Hello")
    } while (false)

    while (false) {
        println("Hello 2")
    }

    for (word in myArray){
        if (word == "Apple"){
            println(word)
            break
        }else{
            println(word)
            continue
        }
    }

}

fun getSubStatus() = "active"