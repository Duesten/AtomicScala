def explicit(c1:Double, c2:Double, c3:Double):
  Vector[Double] = {
  Vector(c1, c2, c3)
}

println(explicit(1.0,2.0,3.0))

def explicit(v:Vector[Double]):
  List[Double] = {
  	v.toList
}

println(explicit(Vector(1.0,2.0,3.0)))

def explicitSet(v:Vector[Double]):
  Set[Double] = {
  	v.toSet
}

println(explicitSet(Vector(1.0,2.0,3.0)))

def historicalData(weather: Vector[Int]) : String = {
  var sunny = 0
  var mostlySunny = 0
  var mostlyCloudy = 0

  for (s <- weather) {

    s match {
      case 100 => sunny += 1
      case 80 => mostlySunny += 1
      case 20 => mostlyCloudy += 1
    }

  }
  val forecastString = ("Sunny=" + sunny+", Mostly Sunny=" + mostlySunny+", Mostly Cloudy=" + mostlyCloudy)

  forecastString
}

val weather = Vector(100, 80, 20, 100, 20)
println(historicalData(weather))

