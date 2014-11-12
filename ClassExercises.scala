// class Dimension(var height:Int, var width:Int)

// val c = new Dimension(10,6)
// println(c.height)

class Info(val name:String, var description:String)

val asd = new Info("info1","ok")

println(asd.name)


class Info2(var name:String, var description:String)

val asd2 = new Info2("info1","ok")

asd2.name = "new name"
assert(asd2.name == "new name")

class SimpleTime(var hours:Int,var minutes:Int = 0){
	def subtract(asd:SimpleTime)={
		if(hours < asd.hours) {new SimpleTime(0,0)} else if (minutes < asd.minutes){ new SimpleTime(hours-asd.hours-1,60+minutes-asd.minutes)} else  {
			hours -= asd.hours
			minutes -= asd.minutes
			new SimpleTime(hours,minutes)
		}
	}
}

val st1 = new SimpleTime(10,30).subtract(new SimpleTime(9,20))

println(st1.hours + " " + st1.minutes)

val st2 = new SimpleTime(10,30).subtract(new SimpleTime(11,40))

println(st2.hours + " " + st2.minutes)


val st3 = new SimpleTime(10,30).subtract(new SimpleTime(9,40))

println(st3.hours + " " + st3.minutes)

val st4 = new SimpleTime(3,59).subtract(new SimpleTime(2,60))

println(st4.hours + " " + st4.minutes)

class SimpleTimeA(var hours:Int = 0,var minutes:Int = 0){
	
	def this(hours:Int) = {
		this(hours,0)
	}

	def subtract(asd:SimpleTimeA)={
		if(hours < asd.hours) {new SimpleTime(0,0)} else if (minutes < asd.minutes){ new SimpleTime(hours-asd.hours-1,60+minutes-asd.minutes)} else  {
			hours -= asd.hours
			minutes -= asd.minutes
			new SimpleTime(hours,minutes)
		}
	}
}


val sta1 = new SimpleTimeA(10,5)
val sta2 = new SimpleTimeA(6)
val sta3 = sta1.subtract(sta2)
println(sta3.hours + " " + sta3.minutes)

val sta4 = new SimpleTimeA(12).subtract(new SimpleTimeA(0,45))
println(sta4.hours + " " + sta4.minutes)

case class Person(f:String,l:String,e:String){
}

val p = Person("Jane","Smile","Jane@Smile.com")

println(p.toString)

val people = Vector(
	Person("Jane","Smile","Jane@Smile.com"),
	Person("Damn","Man","Damn@Man.com"),
	Person("Asd","Dsa","Asd@Dsa.com"))

println(people(0))
println(people(1))
println(people(2))


case class Dog(name:String,breed:String){
	
}


val doggies = Vector(Dog("Fido","Golden Lab"),Dog("Ruff","Alaskan Malamute"),Dog("Fifi","Miniature Poodle"))
println(doggies)

case class Dimension(var h:Int,var w:Int) {
	
}


val c = new Dimension(5,7)

println(c)
c.h=10
println(c)
c.w = 30
println(c)

fu
case class Dimension2(h:Int,var w:Int) {
	
}


val c2 = new Dimension2(5,7)

println(c2)
// c2.h=10 reassignment to val
println(c2)
c2.w = 30
println(c2)


case class Dimension3(h:Int = 10,var w:Int = 10) {
	
}


val c3 = new Dimension3

println(c3)
c3.w = 30
println(c3)



case class SimpleTimeCase(var hours:Int,var minutes:Int = 0){
	def subtract(asd:SimpleTime)={
		if(hours < asd.hours) {new SimpleTime(0,0)} else if (minutes < asd.minutes){ new SimpleTime(hours-asd.hours-1,60+minutes-asd.minutes)} else  {
			hours -= asd.hours
			minutes -= asd.minutes
			new SimpleTime(hours,minutes)
		}
	}
} //Yep, defaults work in case classes

