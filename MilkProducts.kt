package MilkProduct
open class MilkProducts() {
    var name = "Undefined"
    var weight:Double = 0.0
    var fatcontent: Float = 0.0f
    var manufacturer:String = "Undefined"
    var price:UInt = 0u

    constructor(_name: String): this (){
        name = _name
    }
    constructor(_name: String, _weight: Double) : this(_name) {
        weight = _weight
    }
    constructor(_name: String, _weight: Double,_fatcontent: Float) : this(_name, _weight) {
        fatcontent = _fatcontent
    }
    constructor(_name: String, _weight: Double,_fatcontent: Float, _price: UInt) : this(_name, _weight, _fatcontent) {
        price = _price
    }

    open fun milkproducWeight(name:String, weight:Double, fatcontent:Float){
        println("$name weight: $weight gram and fat content: $fatcontent.")
    }
    open fun milkproductManufacturer(name:String, manufacturer:String){
        println("$name from the manufacturer $manufacturer.")
    }
    open fun milkproductPrice(price:UInt){
        println("For sale at a price $price rubles.")
        if (price <= 0u )
        {
            println("The product is sold or in short supply.")
        }
    }
}