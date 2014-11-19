case class Person(f: String, l: String, m: String) {
  override def toString = f+ " " + l
  val fN = toString
}

val p = Person("Tony", "Cartoni", "dio@cane.com")

val a = "1"
val b = "2"
val c = "3"

val people =  Vector(Person(b,a,c),Person(c,b,a),Person(a,c,b))

println(people.size)

val sorted = people.sortBy(_.l)
println (sorted)

trait Contact {
	val email: String	
}

class Personasd(val first: String , val last: String){
	override def toString = first + " " + last
}

class Friend(first: String, last: String, val email:String) extends Personasd(first,last) with Contact{

}

val s1 = people.sortBy(_.first)
val s2 = s1.sortBy(_.last)