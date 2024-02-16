
open class People(var name1 : String,var name2 : String,var name3: String,var gender: String,var age : Int,var weight : Double,var height : Double)
{
    open fun setdata()
    {
        try {
            println("Введите имя человека")
            name1 = readLine().toString()
            println("Введите фамилию человека")
            name2 = readLine().toString()
            println("Введите отчество человека")
            name3 = readLine().toString()
            println("Введите пол человека (Мужчина | Женщина)")
            gender = readLine().toString()
            do {
            println("Введите возраст человека в годах")
                age = readLine()!!.toInt()
            } while (age < 0)
            do {
            println("Введите вес человека в кг")
            weight = readLine()!!.toDouble()
            } while (weight < 0 && weight > 999)
            do {
            println("Введите рост человека в см")
            height = readLine()!!.toDouble()
        } while (weight < 0 && weight > 999)
        }
        catch (e:Exception)
        {
            println("Данные введены неверно")
        }
    }
    fun getage() : Int
    {
        return age
    }
    fun getname1() : String
    {
        return name1
    }
    fun getname2() : String
    {
        return name2
    }
    fun getname3() : String
    {
        return name3
    }
    fun getgender() : String
    {
        return gender
    }
    fun getheight() : Double
    {
        return height
    }
    fun getweight() : Double
    {
        return weight
    }

}

