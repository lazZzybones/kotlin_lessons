package Interface

interface Iphone {
    fun call()

    fun swipe()
}


class Phone1 : Iphone {
    override fun call() {
        println("1")
    }

    override fun swipe() {
        TODO("Not yet implemented")
    }
}

class Phone2 : Iphone {
    override fun call() {
        println("2")
    }

    override fun swipe() {
        TODO("Not yet implemented")
    }

}

fun call(phone: Iphone) {
    phone.call()

}

fun main() {
    val p1 = Phone1()
    val p2 = Phone2()

    call(p1)

    call(p2)
}