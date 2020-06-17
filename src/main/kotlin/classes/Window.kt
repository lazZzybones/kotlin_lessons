package classes

class Window(val size:Int) {
    var windowOpen = false

    fun open(){
        println("Opened")
        windowOpen = true
    }

    fun close(){
        println("Closed")
        windowOpen = false
    }

    fun isOpen():Boolean{
        return windowOpen
    }

    fun isClose():Boolean{
        return !windowOpen
    }
}


fun main(){
    val win1 = Window(1000)

    println(win1.windowOpen)

    win1.open()

    println(win1.windowOpen)

    win1.close()

    println(win1.windowOpen)


    if (win1.isClose()){
        win1.open()
    }






}