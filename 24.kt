fun main()
{
    try
    {


    var x = readLine()!!.toInt()
    var y = readLine()!!.toInt()
    when (x < 0 && y > 0)
        {
        true -> print("1-я четверть")
        false -> when(x<0 && y<0)
            {
            true -> print ("2-я четверть")
            false -> when (x>0 && y<0)
                {
                true -> print("3-я четверть")
                false -> print("4-я четверть")
                }
            }
        }
    }
    catch(e:Exception)
    {
        print("Некорректно введены значения")
    }
}