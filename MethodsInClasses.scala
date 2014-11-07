class Sailboat{
	
	def raiseSails():String = {
		println("sails raised")
		"sails raised"
	}
	
	def lowerSails():String = {
		println("sails lowered")
		"sails lowered"
	}
	def signal():String = {
		val flare = new Flare
		flare.light
	}
}

class Motorboat{
	var isOn:Boolean = false
	
	def turnOn():String = {
		isOn = true
		"Motor On"
	}

	def turnOff():String = {
		isOn = false
		"Motor Off"
	}

	def signal():String ={
		val flare = new Flare
		flare.light
	}
}

val sailboat = new Sailboat
val motorboat = new Motorboat

val r1 = sailboat.raiseSails()
val r2 = sailboat.lowerSails()
val s1 = motorboat.turnOn()
val s2 = motorboat.turnOff()

assert(r1 == "sails raised")
assert(r2 == "sails lowered")
assert(s1 == "Motor On")
assert(s2 == "Motor Off")

class Flare{
	def light():String = {
		"Flare used!"
	}
}

val flare = new Flare
assert(flare.light == "Flare used!")

val sailboat2 = new Sailboat //Book asks to satisfy val sailboat2 = new Sailboat2 but asked to edit original sailboat class, therefore the type doesn't exist
val signal = sailboat2.signal()
assert(signal=="Flare used!")
val motorboat2 = new Motorboat
val flare2 = motorboat2.signal()
assert(flare2 == "Flare used!")