
fun main()
{
    var man : People = People("unnamed","unnamed","unnamed","unnamed",0,0.0,0.0)
    man.setdata()
    if (man.getage() > 15)
    {
        var student : Student = Student("unnamed","unnamed",man.getname1(),man.getname2(),man.getname3(),man.getgender(),man.getage(),man.getweight(),man.getheight())
        student.setdata()
        student.studentsport()
        println("Ваша группа для женщин или мужчин? (Мужчина | Женщина)")
        var req = readLine().toString()
        student.checkreq(req)
        student.getdata()
    }
    else
    {
        println("Этот человек еще не студент, либо стар")
    }


}
