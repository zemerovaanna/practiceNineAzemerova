package Milk
import MilkProduct.*
open class Milk(_name:String) : MilkProducts(_name) {
    var _weight = (weight/1000).toString() + " ml"
    var _fatcontent = "$fatcontent%"

    fun toBuy() {
            var temp = (weight / 100).toUInt()
            temp = price * temp
            println("$_weight молока стоит $temp")
    }

    fun sales() {
            var temp = (weight / 100).toUInt()
            temp = price * temp / 3u
            println("Прибыль с $_weight молока")
    }

    fun getAmount() {
        println("Объем молока $_weight")
    }

}