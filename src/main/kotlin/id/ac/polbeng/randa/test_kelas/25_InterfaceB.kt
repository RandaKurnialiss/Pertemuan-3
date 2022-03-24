package id.ac.polbeng.randa.test_kelas

interface Named {
    val name: String
}

interface Person : Named {
    val firstName: String
    val lastName: String
    override val name: String get() = "$firstName $lastName"
}
data class EmployeeB(
    override val firstName: String,
    override val lastName: String,
    val position: String
) : Person
fun main(){
    val pegawai = EmployeeB("Randa", "Bhizer", "Programmer")
    println(pegawai.name)
}