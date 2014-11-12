var str = ""
var v = Vector(1,2,3,4)
v.foreach(n => str = str + n + ",")
println(str)


var a = (n:Int) => println(n*7)

println(a(3))

val v1 = Vector(1, 5, 7, 8)
var s = ""

v1.foreach(n => s += n*n)
println(s)

def between = (temp:Int,low:Int,high:Int) => (if(temp>low && temp < high){true} else {false}) 

println(between(3,1,5))


var str1 = ""
val numbers = Vector(1,2,3,4,5)
numbers.foreach(a)


var stre = ""

var pluralize = (s:String) => (s + "s ")
// pluralize("asd")
// println(stre)


val words = Vector("dog","cat","shiet")

println(words.map(pluralize))

// println(pluralize)

println(words)

var stringherini = ""
val v123 = Vector(1,2,3,4)
println(v123.foreach(n => stringherini += n*11 + 10))
println(stringherini)


