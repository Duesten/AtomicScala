var asd = Vector("The","Dog","Visited","Firehouse ")
println(asd(1))

var a = 0
var b = ""
for(i <- asd){
	println(asd(a).reverse)
	a += 1
}

println(asd(3).replace(" ", "!"))

var asdasd = Vector(1,2,3,4)
var dsadsa = Vector(1.0,2.0,3.0,4.0)

println(asdasd.max)
println(dsadsa.max)
println(asdasd.sum)
println(dsadsa.sum)
println(asdasd.min)
println(dsadsa.min)

val asdf = Vector("sdfda","as","asdadsasd")

println(asdf.max + " " + asdf.min ) 

println(Range(0,10).inclusive.sum)
//ex9 > yup

val asdList = List("asdf","adsassa","asdasd")
val asdSet = Set("asd","asdasd","asddasd")

println(asdList.reverse)
println(asdList.sorted)

assert({val vect1 = Vector("1","2","3","4","5","6");vect1} == {val vect2 = Vector("1","2","3","4","5","6");vect2})

def isPalindromeIgnoreCase(x:String):Boolean = {
	if(x.toLowerCase == (x.reverse).toLowerCase){
		return true
	}
	false
}

println(isPalindromeIgnoreCase("Ada"))
println(isPalindromeIgnoreCase("sDA"))

def trimSpecial(x:String):String = {
	var res:String = ""
	for(curr <- x){
		if ( (curr.toInt > 64 && curr.toInt < 91) || (curr.toInt > 96 && curr.toInt < 123 ) ){
			res = res + curr
		}	
	}
	res
}


println(isPalindromeIgnoreCase(trimSpecial(" asd ;#@!#$ d@@s$a ")))
