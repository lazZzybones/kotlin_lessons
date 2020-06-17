package classes

class Bank(val name:String, val employees:ArrayList<User>) {

}

fun main() {
    val user1 = User("example@test.by", "qwerty") //1111111
    val user2 = User("example_2@test.by", "qwerty_2") //2222222
    val user3 = User("example@jobs.tut.by", "123") //333333333

    val userList = arrayListOf<User>(user1, user2, user3)

    val prior = Bank("Prior", userList)

    val user4 = User("alfa@info.com", "1234356")
    val alfa = Bank("Alfa", arrayListOf(user4))

    val nbrb = arrayListOf<Bank>(prior, alfa)

    nbrb.forEach{
        println("Bank is ${it.name} has ${it.employees.size} employees")
    }
}