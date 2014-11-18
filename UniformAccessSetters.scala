class asd{
  var internal = 1
  def x = internal
  def x_=(asd:Int) = internal = asd
}

val tryout = new asd

println(tryout.x)
tryout.x = 30
println(tryout.x)

