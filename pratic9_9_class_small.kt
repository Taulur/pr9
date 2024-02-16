
class Student(var group : String, var sport : String, name1 : String, name2 : String, name3: String, gender : String, age : Int, weight : Double, height : Double) : People (name1,name2,name3,gender,age,weight,height)
{
    override fun setdata()
    {
        try {
        println("Введите группу студента")
        group = readLine().toString()
        }
        catch (e:Exception)
        {
            println("Данные введены неверно")
        }
    }
    fun studentsport()
    {
        if (height > 180 && weight < 100 && gender == "Мужчина")
        {
            sport = "Баскетболл"
        }
        else if (height > 165 && weight < 80 && gender == "Женщина")
        {
            sport = "Волейбол"
        }
        else
        {
            sport = "Нету"
        }
    }
    fun checkreq(req : String)
    {
        if (req == gender)
        {
            println("Группа подходит")
        }
        else
        {
            println("Группа не подходит")
        }
    }
    fun getdata()
    {
        println("Имя - ${name1}")
        println("Фамиия - ${name2}")
        println("Отчество - ${name3}")
        println("Пол - ${gender}")
        println("Возраст - ${age}")
        println("Вес - ${weight}")
        println("Рост - ${height}")
        println("Группа - ${group}")
        println("Спорт - ${sport}")

    }



}


