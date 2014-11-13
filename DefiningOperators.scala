class SimpleTime(var hours:Int,var minutes:Int = 0){
	def -(asd:SimpleTime)={
		if(hours < asd.hours) {new SimpleTime(0,0)} else if (minutes < asd.minutes){ new SimpleTime(hours-asd.hours-1,60+minutes-asd.minutes)} else  {
			hours -= asd.hours
			minutes -= asd.minutes
			new SimpleTime(hours,minutes)
		}
	}
}

class FancyNumber1(a:Int){
	def ^(n:Int) = power(n)
	def **(n:Int) = power(n)
	def power(n:Int) = scala.math.pow(a,n).toInt

}

val asd = new FancyNumber1(3)
println(asd ^ 2)

