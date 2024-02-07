import kotlin.math.max

fun main()
{
    try {


        var a = readLine()!!.toDouble()
        var b = readLine()!!.toDouble()
        var c = readLine()!!.toDouble()
        var p = (maxOf(a, b, c) + minOf(a, b, c)) / 2
        print(p)
    }
    catch(e:Exception)
    {
        print("Некорректно введены значения")
    }
}