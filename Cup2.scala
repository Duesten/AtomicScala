class Cup2 {
	var percentFull = 0
	val max = 100
	def add(increase:Int):Int = {
		var tryDatIncrease = percentFull + increase

		if(tryDatIncrease < 0){
			percentFull = 0
		}
		else if(tryDatIncrease  > max){
			percentFull = max
		}
		else { percentFull += increase }
		println(percentFull)
		percentFull
	}
	def set(value:Int) ={
		percentFull = value
	}
	def get() = {
		percentFull
	}
}

//Exercise 1 : additional code is not required to satisfy the tests.

val cup = new Cup2
cup.add(50)
cup.add(-70)


assert(cup.add(-100) == 0,"1")
assert(cup.add(45) == 45,"2")
assert(cup.add(-55) == 0,"3")
assert(cup.add(10) == 10,"4")
assert(cup.add(-9) == 1, "5")
assert(cup.add(-2) == 0,"6")


cup.percentFull = 56 //yes, you can (ex3)
println(cup.percentFull)

cup.set(3)
println(cup.get)

