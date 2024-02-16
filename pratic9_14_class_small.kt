
class Car(type : String,name : String,power: Double,price: Double) : Transport (type,name,power,price)
{
    fun isexpensive(pricetest : Double)
    {
        if (pricetest < price)
        {
            println("Цена подходит под требования")
        }
        else
        {
            println("Цена не подходит под требования")
        }
    }
    fun changename(newname : String)
    {
        name = newname
    }
    fun getdata()
    {
        println("Тип транспорта - ${type}")
        println("Марка - ${name}")
        println("Мощность - ${power}")
        println("Цена - ${price} рублей")

    }



}


