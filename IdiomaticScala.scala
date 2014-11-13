val a = false
if(a)
  println("True")
else
  println("False")


if (false) println("True")
else       println("False")


a match {
	case true => println("True")
	case false => println("False")
}

val result = {
  if(99 > 100) 4  
  else  42 
}
println(result)

val r =
  if (99 > 100) 4
  else 42

 println(r)

 if (99 > 100) println(4)
 else println(42)



for(i <- 0 to 9)
  print(i + " ")
println()

for(i <- 0 until 10)
  print(i + " ")
println()

for(i <- Range(0, 10))
  print(i + " ")
println()

for(i <- Range(0, 20, 2))
  print(i + " ")
println()

var sum = 0
for(i <- Range(0, 20, 2)) {
  println( i + " + " + sum)
  sum += i
}
println("Sum >" + sum)


val act = "swimming"
val hour = 10

val isOpen = {
  if(act == "swim" || act == "ice skating") {
    val opens = 9
    val closes = 20
    println("Hours: " + opens + "-" + closes)
    if(hour >= opens && hour <= closes) true else false
  } else true
}

println(isOpen)



def addMultiply(x:Int, y:Double, s:String):Double = {
  println(s)
  (x + y) * 2.1
}
def simplyPrint() = {
  println("Nothin will be returned")
}
val r2:Double = addMultiply(7, 9, "Damn")
println(r2)





def checkTruth(asd:Boolean, ads:Boolean):String = {
  if(asd && ads) "Both false"
  else if(!asd && !ads)
    "Both false"
  else if(asd)
    "First true second false"
  else
    "First false second true"
}

class Dog {
  def bark:String = "yip!" 
}

class Cat {
  def meow = "mew!"
}

class Hamster {
  def speak = "squeak!"
  def exercise = speak + " Running on wheel"
}

class ClassArg(a:Int) {
  println(f)
  def f = a * 10
}

val ca = new ClassArg(19)

class Sum(args:Int*) {
  def result:Int = { var total = 0 ; for(n <- args) total += n ; total}
}




