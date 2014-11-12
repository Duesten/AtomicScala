val v = Vector(1, 2, 3, 4)
println(v.map(n => n*11+10))

val v1 = Vector(1, 2, 3, 4)
println(v1.foreach(n => n + 1))
//Unit is returned


var result = ""
val v2 = Vector(1, 2, 3, 4)
v2.foreach(n => result += n + 1)
println(result)


var result2 = ""
val v3 = Vector(1, 2, 3, 4)
for(a <- v3){
	result2 += a
}


// for(a -> v3)

println(result2)




var sum = 0
val vect1 = Vector(1,10,100,1000)
for(a <- vect1){
	sum = sum + a
}
println(sum)



def sumIt(n:Int*):Int = {
	n.reduce((sum,n) => sum + n)
}

println(sumIt(1,2,3).toString)