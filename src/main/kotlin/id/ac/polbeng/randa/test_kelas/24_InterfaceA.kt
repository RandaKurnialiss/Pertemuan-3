package id.ac.polbeng.randa.test_kelas

interface MyInterface{
    var str: String
    fun demo()
    fun func(){
        println("Hello")
    }
}
class MyClass: MyInterface{
    override var str: String = "Rekayasa Perangkat Lunak Keren"
    override fun demo() {
        println("Demo Function")
    }
}
fun main() {
    val obj = MyClass()
    obj.demo()
    obj.func()
    println(obj.str)
}