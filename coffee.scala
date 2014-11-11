// Coffee.scala
import com.atomicscala.AtomicTest._

class Coffee(val shots:Int = 2,
             val decaf:Int = 0,
             val milk:Boolean = false,
             val toGo:Boolean = false,
             val syrup:String = "") {
  var result = ""
  println(shots, decaf, milk, toGo, syrup)
  def getCup():Unit = {
    if(toGo)
      result += "ToGoCup "
    else
      result += "HereCup "
  }
  def pourShots():Unit = {
    for(s <- 0 until decaf)
        result += "decafshot "
    for(a <-0 until shots)
        result += "shot "
  }
  def addMilk():Unit = {
    if(milk)
      result += "milk "
  }
  def addSyrup():Unit = {
    result += syrup
  }
  getCup()
  pourShots()
  addMilk()
  addSyrup()
}

val coffee1 = new Coffee(shots=2,decaf = 1)
val coffee2 = new Coffee(shots=3,decaf = 2)

println(coffee1.decaf)
println(coffee2.decaf)

println(coffee1.result)
println(coffee2.result)

