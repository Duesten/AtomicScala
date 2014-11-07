val r = Range(0,10)
println(r.step)

val r2 = Range(0,10,2)
println(r2.step)

//Answer : Used another constructor that accepts step value as third argument

val s:String = "This is an experiment"
s.split(" ")
println(s)

var s1:String = "Sally"
var s2:String = "Sally"

if(s1.equals(s2)) println("s1 and s2 are equal")

s2 = "Sam"

if(s1.equals(s2)) println("s1 and s2 are equal") else println("s1 and s2 are not equal")
println("value of s1 "  + s1 )

var s3 = s1.toUpperCase()
if(s1.contentEquals(s3)) println("s1 and s2 are equal") else println("s1 and s2 not equal")