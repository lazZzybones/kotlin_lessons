package Interface

class Cat : Animal(), Imyrmyr, IJumpable {
    override fun myrmyr() {
        println("myrr")
    }

    override fun jump() {
        println("myu myu prig prig")
    }

}