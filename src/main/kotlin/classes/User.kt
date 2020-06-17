package classes

class User(var login: String, var pass: String) {

}

fun main() {
    val user1 = User("example@test.by", "qwerty") //1111111
    val user2 = User("example_2@test.by", "qwerty_2") //2222222
    val user3 = User("example@jobs.tut.by", "123") //333333333

    val userList = arrayListOf<User>(user1, user2, user3)

    userList.forEach {
        writeToDB(it)
    }
}

fun writeToDB(user: User) {
    println("${user.login} added to DB")
}
