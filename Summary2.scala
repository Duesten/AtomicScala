var v1 = Vector('a','b','c')
var v2 = Vector(1,2,3)
var v3 = Vector("a","b","c")



v1 = v1.sorted
v2 = v2.sorted
v3 = v3.sorted

println(v1.max + v2.max + v3.max)
println(v1.min + v2.min + v3.min)

var s1 = ""
var s2 = ""
var s3 = ""


for(c <- v1){
	s1 = s1 + c.toString
}

println(s1)


for(d <- v2){
	s2 = s2 + d.toString
}

println(s2)

for(e <- v3) {
	s3 = s3 + e
}

println(s3)

val v123 = Vector(v1,v2,v3)

var s4 = ""

for(a <- v123){
	for(b <- a){
		s4 += b
	}
}

println(s4)