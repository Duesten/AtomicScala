class Animal extends Mobile
class Vehicle extends Mobile

trait Mobile

def move(arg: Mobile) = {
	println("Moving")
}

val asd = new Animal
val dsa = new Vehicle

move(asd)
move(dsa)

class Element{
	def draw = "Drawing element"
}

class Inert extends Element{
	override def draw = "Inert drawing"
}

class Wall extends Inert{
	override def draw = "Don't draw on walls pls"
}


val e = new Element
val in = new Inert
val wall = new Wall

println(e.draw)
println(in.draw)
println(wall.draw)

class Character(val player:String = "Nobody") extends Element
class Dragon extends Character("Puff")

println((new Dragon ).player)