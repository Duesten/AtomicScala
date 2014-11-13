def getOddLT10(v:Vector[Int]):Vector[Int]={
  
  for {
    n <- v
    if n < 10
    isOdd = (n % 2 != 0)
    if(isOdd)
  } yield n
}

val v = Vector(1,2,3,5,6,7,8,10,13,14,17)
println(getOddLT10(v))

def getOddLT10v2(v:List[Int]):List[Int]={
  
  for {
    n <- v
    if n < 10
    isOdd = (n % 2 != 0)
    if(isOdd)
  } yield n
}

val v1 = List(1,2,3,5,6,7,8,10,13,14,17)
println(getOddLT10v2(v1))


def yielding3(v:List[Int]):Vector[Int]={
  for {
    n <- v
    if n < 10
    isOdd = (n % 2 != 0)
    if(isOdd)
  } yield {
    val u = n * 10
    u + 2
  }
}

val vasd = Vector(1,2,3,5,6,7,8,10,13,14,17)
println(yielding3(vasd))




























