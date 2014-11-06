def getSquare(x:Int):Int={
	println(x*x)
	x*x

}

def getSquareDouble(x:Double):Double = {
	println(x*x)
	x*x
}


val sd1 = getSquareDouble(1.2)
assert(1.44 == sd1,"not as expected")
val sd2 = getSquareDouble(5.7)
assert(32.49 == sd2,"not as expected " )


val a = getSquare(3)
assert(a==9, "didn't get 9")
val b = getSquare(6)
assert(b==36,"didn't get 36")
val c = getSquare(5)
assert(c==25,"didn't get 25")

//Answer ex 2 : gotta make sure return value expected is Double instead or type mismatch

def isArg1GreaterThanArg2(x:Double,y:Double):Boolean = {
	if(x>y){println(true); true}
	else{println(false); false}
	
}

val bool1 = isArg1GreaterThanArg2(4.1,4.12)
assert(bool1 == false, "unexpected result")
val bool2 = isArg1GreaterThanArg2(2.1,1.2)
assert(bool2 == true, "unexpected result")

def unShout(s:String):String = {
	println(s.toLowerCase)
	s.toLowerCase
}

val g1 = unShout("asdASdaASASD")
assert("asdASdaASASD".toLowerCase == g1)
val g2 = unShout("asdASD")
assert("asdasd" == g2)

def addStrings(s1:String,s2:String):String = {
	println(s1+s2)
	s1+s2
}

val s1 = addStrings("abc","def")
assert("abcdef"==s1)

val s2 = addStrings("zyx","abc")
assert("zyxabc"==s2)

def manyTimesString(s:String,n:Int):String = {
	s * n
	
}

println(manyTimesString("a",4))

def bmiStatus(w:Double,h:Double):String = {  
	val bmi = w/(h*h)*703.07

	if(bmi <  18.5) {"underweight"}
	else if (bmi < 25) {"normal"}
	else {"fat"}
}

val normale = bmiStatus(160, 68)
assert(normale == "normal",normal)

val underweight = bmiStatus(100,68)
assert(underweight == "underweight")

val overweight = bmiStatus(180,60)
assert(overweight == "fat")



