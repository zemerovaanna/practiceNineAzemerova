import Icecream.*
open class Plombir(_name: String): Icecream(_name) {
    var ves:Short = 0
    var fat:Byte = 0
    var countplombir:Short = 0

    fun costplombir() {
        var temp = (ves * 810 / 1000).toUInt()
        println("$ves пломбира стоит $temp")
    }

    fun saleplombir() {
        var temp = (ves / 100).toUInt()
        temp = temp / 3u
        println("Прибыль с $ves с пломбира $temp")
    }

    fun amountplombir() {
        var temp:Int = countplombir * 50 / 10
        println("$countplombir стоит $temp")
    }
}