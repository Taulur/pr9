
fun main()
{
    var transport : Transport = Transport("unnamed","unnamed",0.0,0.0)
    transport.setdata()
    if (transport.type == "Автомобиль")
    {
        var car : Car = Car(transport.gettype(),transport.getname(),transport.getpower(),transport.getprice())
        println("Введите приемлемую цену для автомобиля")
        var pricetest = readLine()!!.toDouble()
        car.isexpensive(pricetest)
        println("Введите новую марку для автомобиля")
        var newname = readLine().toString()
        car.changename(newname)
        car.getdata()
    }
    else
    {
        println("Этот транспорт не автомобиль")
    }


}
