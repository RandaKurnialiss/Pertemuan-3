package id.ac.polbeng.randa.test_kelas

open class Mahasiswa(var nama: String, var nrp: Int){
    open fun info() {
        println(nama +'\n'+ nrp);
    }
    fun String(): String {
        return "Mahasiswa{nama= $nama, nrp= $nrp}"
    }
}
class KetuaHima(nama: String, nrp: Int, val jurusan: String) : Mahasiswa(nama, nrp) {
    @Override
    override fun info(){
        println(nama +'\n'+ nrp +'\n'+ jurusan);
    }
}
fun main(){
    val budi = Mahasiswa("Randa Kurnialis", 1106123)
    val anton = KetuaHima("Randa", 1106789, "Teknik Informatika")
    println(anton.toString());
    println()
    anton.info()
    println("Jenis Kelas = " + anton.javaClass.simpleName)
    println()
    budi.info()
    println("Jenis Kelas = " + budi.javaClass.simpleName)

    val ucok = KetuaHima("Alex", 1105239, "Teknik Elektro")
    println()
    ucok.info()
    println("Jenis Kelas = " + ucok.javaClass.simpleName)
}