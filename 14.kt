fun main()
{
    try
    {
        var x = readLine()!!.toInt()
        var y = readLine()!!.toInt()
        var m = readLine()!!.toInt()
        var n = readLine()!!.toInt()
        when(x-y > m%n)
        {
            true -> x+=1
        }
    }
    catch (e:Exception)
    {
        print("Некорректно введены значения")
    }
}
