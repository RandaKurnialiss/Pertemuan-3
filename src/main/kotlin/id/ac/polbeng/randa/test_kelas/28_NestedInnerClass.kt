package id.ac.polbeng.randa.test_kelas

class Outer {
    val a = "Outside Nested class."
    class Nested {
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }
}

fun main(args: Array<String>) {
    println(Outer.Nested().b)
    val nested = Outer.Nested()
    println(nested.callMe())
}