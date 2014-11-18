class GreatApe {
  val weight = 100.0
  val age = 12
  def vocalize = "Grrr!" 
}

object GreatApe{

}

class Bonobo extends GreatApe
class Chimpanzee extends GreatApe
class BonoboB extends Bonobo

def display(ape:GreatApe) =
  s"weight: ${ape.weight} age: ${ape.age}"

println(says(new BonoboB ) ) 

def says(ape:GreatApe) = {
	ape.vocalize
}

class Cycle(var wheels:Int = 2){
	def ride = "Riding"
}

class Bicycle extends Cycle

val a = new Cycle
println(a.ride)
val b = new Bicycle
println(b.ride)
println(b.wheels)


class GreatApe2(
	val weight:Double, val age:Int)
class Bonobo2(weight:Double ,age:Int) extends GreatApe2(weight, age)
class Chimpanzee2(weight:Double, age:Int) extends GreatApe2(weight,age)
class BonoboB2(weight:Double, age:Int) extends Bonobo2(weight,age)

def display2(ape:GreatApe2) = s"weight: ${ape.weight} age: ${ape.age}"

println(display2(new GreatApe2(200,12)))

println(display2(new Bonobo2(100,12)))

println(display2(new Chimpanzee2(100,12)))

println(display2(new BonoboB2(100,12)))



class GreatApe3(val weight:Double,val age:Int,val sex:String){
	def myWords = Vector("Roar")
}
class Bonobo3(weight:Double, age:Int, sex:String) extends GreatApe3(weight,age,sex){
	myWords
}

class BonoboB3( weight:Double, age:Int, sex:String) extends Bonobo3(weight,age,sex)
class BonoboC(weight:Double,age:Int,sex:String) extends BonoboB3(weight,age,sex)


val roaringApe = new GreatApe3(112,9,"Male")
println(roaringApe.myWords)

class House(val zip:Int, val asd:Int){
	def desc = zip.toString + asd.toString
}

class Home(val heart:Boolean = true , zip:Int = 0, asd:Int = 0) extends House(zip,asd) {
	println(desc)
	override def toString = "Where the heart is"
}

val asd = new Home(heart = true)
println(asd)
println(asd.heart)


class VacationHouse(zip:Int, asd:Int, val startMonth:Int, val endMonth:Int) extends House(zip, asd){
	override def toString = "Rented house from " + new MonthIntToString(startMonth) + " to " + new MonthIntToString(endMonth)

}

class MonthIntToString(month:Int){
	override def toString = {
		month match {
		case 1 => "Jan"
		case 2 => "Feb"
		case 3 => "Mar"
		case 4 => "Apr"
		case 5 => "May"
		case 6 => "Jun"
		case 7 => "Jul"
		case 8 => "Aug"
		case 9 => "Sep"
		case 10 => "Oct"
		case 11 => "Nov"
		case 12 => "Dec"
		}	
	}
}

println(new VacationHouse(3201,23,3,6))



class Trip(val origin:String,val destination:String,val start:String,val end:String){
	override def toString = s"From $origin to $destination, $start to $end"
}

class AirplaneTrip(origin:String,destination:String,start:String,end:String,movie:String) extends Trip(origin,destination,start,end)

class CarTrip(origin:String,destination:String,start:String,end:String,places:Vector[String]) extends Trip(origin,destination,start,end)

val t0 = new Trip("Detroit","Houston","5/1/2012","6/1/2012")
val t1 = new AirplaneTrip("Detroit","London","9/1/1939","10/31/1939","BoomBoom")
val cities = Vector("Detroit","Feltre","Belluno","Fattorie","Diomerda","Bladibla")
val t2 = new CarTrip("Madre","Padre","13/13/130000","13/13/13000",cities)

println(t2.origin)
println(t2.destination)
println(t0)
println(t2)

//Yes
//Yes

case class TripFratello(val asd:String)
class inheritCase(x:String) extends TripFratello(x) 

// ^works



class A{
	def m = "am A"
}

class B extends A{
	override def m = "am B"
}

class C extends B{
	super.m
}


val shiet = new C
println(shiet.m)



