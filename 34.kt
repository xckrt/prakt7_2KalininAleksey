fun main()
{

    var k = readLine()!!.toDouble()
    var a = readLine()!!.toDouble()
    var b = readLine()!!.toDouble()

    val discriminant = 4 * a * a * k * k - 4 * (b * b - a * a)
    if (discriminant > 0) {
        var x1 = (-2 * a * k + Math.sqrt(discriminant)) / (2 * k * k)
        var x2 = (-2 * a * k - Math.sqrt(discriminant)) / (2 * k * k)
        var y1 = a / x1
        var y2 = a / x2

        println("Число точек пересечения: 2")
        println("Координаты точек:")
        println("($x1, $y1)")
        println("($x2, $y2)")
    }
    else if (discriminant == 0.0) {
        val x = -2 * a * k / (2 * k * k)
        val y = a / x

        println("Число точек пересечения: 1")
        println("Координаты точки:")
        println("($x, $y)")
    }
    else
    {
        println("Число точек пересечения: 0")
    }
}