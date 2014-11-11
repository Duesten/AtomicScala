class Cup2(var percentFull:Int) {
  val max = 100
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) percentFull = max
    percentFull
  }
}

val cup2 = new Cup2(0)

println(cup2.percentFull)


class CupVar(var percentFull:Int) {
  val max = 100
  def increase(quantity:Int*):Int = {
  	for (i<-quantity) {
      percentFull += i
      if(percentFull > max) percentFull = max
    }
    percentFull // Return this value
  }
}
val cupVar1 = new CupVar(0)

def squareSum(args: Int*) = {
	var square = 0
	for(x <- args){
		square = square + x*x
	}
	square
}

println(squareSum(2,4))