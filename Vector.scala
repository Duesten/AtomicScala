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