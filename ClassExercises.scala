class Dimension(var height:Int, var width:Int)

val c = new Dimension(10,6)
println(c.height)

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

class SimpleTimeA(var hours:Int,var minutes:Int = 0){
	
	def this(hours:Int) = {
		this(hours,0)
	}

	def subtract(asd:SimpleTime)={
		if(hours < asd.hours) {new SimpleTime(0,0)} else if (minutes < asd.minutes){ new SimpleTime(hours-asd.hours-1,60+minutes-asd.minutes)} else  {
			hours -= asd.hours
			minutes -= asd.minutes
			new SimpleTime(hours,minutes)
		}
	}
}


val st12 = new SimpleTimeA(6)
println(st12.hours + " " + st12.minutes)