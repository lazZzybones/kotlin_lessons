package Interface

class Dog : Animal(), IJumpable {
    override fun jump() {
        println("gav gav prig prig")
    }
}