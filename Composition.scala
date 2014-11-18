trait Kitchen{
	def utensils:Vector[Utensils]
	def serveFood:Boolean
	def prepFood:Boolean
}

class ServingKitchen extends Kitchen {
  def utensils:Vector[ServeUtensils] = Vector(new ServeUtensils )
  def serveFood:Boolean = true
  def prepFood:Boolean = false
}

class PrepKitchen extends Kitchen {
  def utensils:Vector[PrepUtensils] = Vector(new PrepUtensils )
  def prepFood:Boolean = true
  def serveFood:Boolean = false
}

class SimpleKitchen extends Kitchen {
	def utensils:Vector[Utensils] = Vector(new PrepUtensils, new ServeUtensils )
	def prepFood:Boolean = true
	def serveFood:Boolean = true
}

val serving = new ServingKitchen
println(serving.serveFood)
println(serving.prepFood)
println(serving.utensils)



val prep = new PrepKitchen
println(prep.prepFood)
println(prep.serveFood)
println(prep.utensils)


val simple = new SimpleKitchen
println(simple.prepFood)
println(simple.serveFood)
println(simple.utensils)


trait Utensils

class ServeUtensils extends Utensils
class PrepUtensils extends Utensils