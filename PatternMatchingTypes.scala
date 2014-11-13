case class Person(name:String){
	
}


def plus1(a:Any):String = {
	a match {
		case i:Int => (i+1).toString
		case s:String => s+"s"
		case p:Person => p.name + "guest"
		case _ => "something else > " + a.toString
	}
	
}


var asd:Int = 1

println(plus1("asd") + plus1(asd) + plus1(Person("Fifee")))

def convertToSize(arg:Any):Any = {
	arg match {
		case a:String => a.length
		case i:Int => i
		case d:Double => d
		case p:Person => 1
	}
}

println(convertToSize("asd") + convertToSize(2).toString + convertToSize(2.0) + convertToSize(Person("Dawg")).toString)

def convertToSize2(arg:Any):Int = {
	arg match {
		case a:String => a.length
		case i:Int => i
		case d:Double => d.round.toInt
		case p:Person => 1
	}
}


println(convertToSize2("asd") + convertToSize2(2).toString + convertToSize2(2.4) + convertToSize2(Person("Dawg")).toString)

def quantify(a:Any):String = {
	a match {
		case i:Int if(i < 100) => "Small"
		case i:Int if(i >= 100 && i <= 1000) => "Medium"
		case i:Int if(i > 1000) => "Large"
		case d:Double if(d < 100) => "Small"
		case d:Double if(d >= 100 && d <= 1000) => "Medium"
		case d:Double if(d > 1000) => "Large"

	}
	
}


println(quantify(100))
println(quantify(20.56))
println(quantify(1000000))
println(quantify(-15999))

def forecast(temp: Int) : String = {
	temp match {
       case t if(t < 101 && t > 80) => "Sunny"
       case t if(t < 81 && t > 50) => "Mostly Sunny"
       case t if(t < 51 && t > 20) => "Partly Sunny"
       case t if(t < 20 && t > 0) => "Mostly Cloudy"
       case 0 if(true==true) => "Cloudy"
       case _ => "Unknown"
	}
}



