fun main(args: Array<String>) {
    val hUman = HUman("TutorialsPoint.com", 25)

    val human1 = HUman("Max", 30, "test")

    println(human1.message)

    println(HUman.count_people_2018)

    println(HUman.count_people_2019)

    HUman.test()
    HUman("TutorialsPoint.com", 25).test()

}

class HUman(var firstName: String, var age: Int) {

    var message: String = "Hey!!!"

    companion object{
        const val count_people_2018:Int = 100000
        const val count_people_2019:Int = 100000

        fun test(){
            println("hello")
        }
    }

    fun test(){
        println(this.firstName)
    }


    constructor(name: String, age: Int, message: String) : this(name, age) {
    }

}