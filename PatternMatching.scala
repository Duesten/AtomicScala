// MatchExpressions.scala
import com.atomicscala.AtomicTest._

def matchColor(color:String):String = {
  if(color=="red"){"RED"}
  else if(color=="blue"){"BLUE"}
  else if(color=="green"){"GREEN"}
  else{"Unknown color:" + color}
}

println(matchColor("red"))

val asd = Vector(100,80,50,20,0,15)

def forecast(t: Int):String = {
	t match {
       case 100 => "Sunny"
       case 80 => "Mostly Sunny"
       case 50 => "Partly Sunny"
       case 20 => "Mostly Cloudy"
       case 0 => "Cloudy"
       case _ => "Unknown"
	}
}

for(x <- asd){
	println(forecast(x))
}

