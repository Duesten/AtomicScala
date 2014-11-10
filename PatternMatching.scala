// MatchExpressions.scala
import com.atomicscala.AtomicTest._

def matchColor(color:String):String = {
  if(color=="red"){"RED"}
  else if(color=="blue"){"BLUE"}
  else if(color=="green"){"GREEN"}
  else{"Unknown color:" + color}
}

println(matchColor("red"))

