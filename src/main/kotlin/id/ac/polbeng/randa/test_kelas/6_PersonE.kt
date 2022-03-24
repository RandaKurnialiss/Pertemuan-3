package id.ac.polbeng.randa.test_kelas

class PersonE {

    var firstName: String
    var lastName: String
    var age: Int = 25
    constructor(_firstName: String, _lastName: String){

        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName)

    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }

}

fun main(){

    val anton = PersonE("Frank", "Lampard")
    anton.cetakInfo()

    println()

    val budi = PersonE("Budi", "Gunawan", 21)

    budi.cetakInfo()

}