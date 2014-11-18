import com.atomicscala.AtomicTest._

abstract class Animal {
  def templateMethod =
    s"The $animal goes $sound"
  // Abstract methods (no method body):
  def animal:String
  def sound:String
  def food:String
}

// Error -- abstract class
// cannot be instantiated:
// val a = new Animal

class Duck extends Animal {
  def animal = "Duck"
  // "override" is optional here:
  override def sound = "Quack"
  def food = "plants"
}

class Cow extends Animal {
  def animal = "Cow"
  def sound = "Moo"
  def food = "grass"
}

class Pig extends Animal {
	def animal = "Pig"
	def sound = "snort"
	def food = "anything"
}

class Chicken extends Animal {
	def animal = "Chicken"
	def sound = "Cocoo"
	def food = "insects"
}

class Cat extends Animal {
	def animal = "Cat"
	def sound = "MEO"
	def food = "catfood"
	def animal(x:Int) = s"$x Cats"
}

println((new Chicken ).sound)

abstract class Adder(x:Int) {
	def add(y:Int):Int
}

class NumericAdder(val x:Int) extends Adder(x) {
	def add(y:Int):Int = x+y
}

val num = new NumericAdder(4)
println(num.add(10))

case class abstractInheritAdderCase(x:Int) extends Adder(x) {
	def add(y:Int):Int = x+y
}

val num2 = new abstractInheritAdderCase(10)
println(num2.add(20))


val cat = new Cat
println(cat.animal(2))
println(cat.animal)

//It works : Overloading