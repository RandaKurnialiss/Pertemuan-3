package id.ac.polbeng.randa.test_kelas

interface X {
    fun demoX() {
        println("demoX function")
    }
    fun funcX()
}
interface Y {
    fun demoY() {
        println("demoY function")
    }
    fun funcY()
}

class MyClassA: X, Y {
    override fun funcX() {
        println("Hello")
    }
    override fun funcY() {
        println("Hi")
    }

}
fun main() {
    val obj = MyClassA()
    obj.demoX()
    obj.demoY()
    obj.funcX()
    obj.funcY()
}