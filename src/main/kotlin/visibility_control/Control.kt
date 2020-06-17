package visibility_control

class Control :ParentControl(){
    var str = "1"


    private var str2 = "2"

    var t:String? = null

    fun getSessions(){

        t = "t"
        getSessions2()
    }

    private fun getSessions2(){
//        AWS POSTGRES
    }

    fun print(){
        println(t)

    }
}

open class ParentControl {
    protected val parentName:String = "Parent"

}


fun main() {
    Control().getSessions()

}