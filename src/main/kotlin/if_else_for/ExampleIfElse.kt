package if_else_for

fun main() {

    val price = getPrice()

    if (price == 30) {
        println("Price is $price")
    } else {
        println("Price isn't correct")
    }

    val isNameCorretn = isMyNameValid("S")

    if(isNameCorretn){
        println("Name is correct")
    }else{
        println("Name isn't correct")
    }

    val myName = "Sergey"

    if (myName.equals("Vany")) {
        println("hello Vany")
    } else if (myName.startsWith("S")) {
        println("Your name starts with S")
    } else {
        println("Both cases aren't valid")
    }


    if (myName.startsWith("S")) {
        if (myName.endsWith("y")) {
            if (myName.equals("Sergey")) {
                println("uraa!!!")
            }
        }
    } else {
        println("Invalid")
    }

    myFlow("Dima Gurskiy", 35)

}

fun getPrice() = 30

fun isMyNameValid(name: String): Boolean {
    if (name.equals("Sergey")) {
        return true
    } else {
        return false
    }
}


fun myFlow(name: String, age: Int):Int {
    var count = 0


    if (name.equals("Dima Gurskiy")) {
        println("level 3")
        return 200 //Ok
    }

    if (name.equals("Sergey")) {
        count += 1
    }

    println("CODE_________________")

    if (age > 18) {
        count += 1
    }

    println("CODE_________________")

    when (count) {
        2 -> println("level 2")
        1 -> println("level 1")
        else -> println("level 0")
    }

    val receipt = "ios6"
    when (receipt) {
        "ios6" -> println("old check")
        "ios7" -> println("new check")
        else -> println("invalid")
    }

    //Old style
    if (count == 2) {
        println("level 2")
    } else if (count == 1) {
        println("level 1")
    } else {
        println("level 0")
    }

    return 200 //OK
}