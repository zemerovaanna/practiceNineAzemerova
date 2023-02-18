import Milk.*
open class DryOrIquid (_name:String) : Milk(_name) {
    var moisture:Boolean = true
    var fat:Float = 0.0f
    var proteins:Byte = 0
    var ves:Short = 0

    fun costmilk() {
        var temp = (ves * 600 / 1000).toUInt()
        println("$ves молока стоит $temp")
    }

    fun salemilk() {
        var temp = (ves / 100).toUInt()
        temp = temp / 3u
        println("Прибыль с $ves молока $temp")
    }

    fun milkmoisture() {
        if(moisture == false && fat <=25)
        {
            println("Норма для сухого цельного молока")
        }
        else if(moisture == false && fat >25)
        println("Не норма для сухого цельного молока")
        if(moisture == true)
        {
            when(fat)
            {
                in 2.5..3.5 -> println("жирность молока в норме")
                else -> println("жирность молока не в норме")
            }
        }
    }

}