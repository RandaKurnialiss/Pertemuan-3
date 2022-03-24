package id.ac.polbeng.randa.test_kelas

fun main() {


    var programmer: Human = object : Human {
        override fun think() {
            print("I am Anonymous ")

        }
    }

    programmer.think()
}

interface Human {
    fun think()
}