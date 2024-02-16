
open class Transport(var type : String,var name : String,var power: Double,var price: Double)
{
    open fun setdata()
    {
        try {
            println("Вид транспорта")
            type = readLine().toString()
            println("Введите марку транспорта")
            name = readLine().toString()
            do {
                println("Введите мощность транспорта")
                power = readLine()!!.toDouble()
            } while (power  < 0.0)
            do {
                println("Введите цену транспорта в рубях")
                price = readLine()!!.toDouble()
            } while (price < 0.0)
        }
        catch (e:Exception)
        {
            println("Данные введены неверно")
        }
    }
    fun gettype() : String
    {
        return type
    }
    fun getname() : String
    {
        return name
    }
    fun getpower() : Double
    {
        return power
    }
    fun getprice() : Double
    {
        return price
    }

}

