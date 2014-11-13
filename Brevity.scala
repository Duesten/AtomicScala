def assignResult(arg:Boolean) = if(arg) 42 else 47


println(assignResult(true))


class Coffee(val shots:Int = 2,
             val decaf:Boolean = false,
             val milk:Boolean = false,
             val toGo:Boolean = false,
             val syrup:String = "") {

  println(shots, decaf, milk, toGo, syrup)

  def getCup() = 
    if(toGo) "ToGoCup " else "HereCup "
  
  def pourShots() = 
    if(shots>0) "(" + "shot " *shots + {if(decaf == true) "decaf) " else "normal) "}

  def addMilk()= 
      if(milk)"milk "
      else ""
  

  def addSyrup()= 
    if(syrup.length != 0) syrup+" syrup"
    else ""
  
  var result = getCup() + pourShots() + addMilk() + addSyrup()
  println(result)
}


var asd = new Coffee(milk = true, toGo = true, syrup = "pig fat")
