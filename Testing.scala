/**
val myValue1 = 20
val myValue2 = 10

assert(myValue1 == myValue2, "Ain't the same")

val myValue3 = 10
val myValue4 = 10

assert(myValue3 == myValue4, "Ain't the same")
assert(myValue2 == myValue3, "Ain't the same")

val myValue5 = "10"

assert(myValue5 == myValue2, "Ain't the same")


************* Commented due to intentionally failing asserts that stop execution

**/
def squareArea(x:Int):Int = {x*x}
def rectangleArea(x:Int,y:Int):Int = {x*y}
def trapezoidArea(x:Double,y:Double,h:Double):Double = {h/2 * (x+y)}

assert(squareArea(1) == 1,"1")
assert(squareArea(2) == 4,"2")
assert(squareArea(5) == 25,"3")
assert(rectangleArea(2,2) == 4,"4")
assert(rectangleArea(5,4) == 20,"5")
assert(trapezoidArea(2,2,4) == 8,"6")
assert(trapezoidArea(3,4,1) == 3.5,"7")

