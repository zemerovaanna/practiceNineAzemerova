package Icecream
import MilkProduct.*
import kotlin.math.roundToInt
open class Icecream(_name: String) : MilkProducts(_name) {
    var inChoco = false
    var _weight = "$weight kg"
    var _fatcontent = "$fatcontent%"
    var amount = 0u
    var _amount = "$amount шт"

    fun getKupit() {
        if (inChoco == false) {
            var temp = (weight / 100).toUInt()
            temp = price * temp
            println("$_weight мороженого стоит $temp")
        } else {
            var temp = (weight / 75).toUInt()
            temp = price * temp
            println("$_weight мороженого стоит $temp")
        }
    }

    fun getProdat() {
        if (inChoco == false) {
            var temp = (weight / 100).toUInt()
            temp = price * temp / 3u
            println("Прибыль с $_weight мороженого")
        } else {
            var temp = (weight / 75).toUInt()
            temp = price * temp / 3u
            println("Прибыль с $_weight мороженого")
        }
    }

    fun getAmount() {
        amount = (weight / 1000).roundToInt().toUInt()
        println("Кол-во мороженого $_amount")
    }
}