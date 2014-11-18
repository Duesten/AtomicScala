class Battery extends EnergySource with BatteryPower

trait EnergySource

trait BatteryPower {
	def monitor(x:Int) = {
		if (x > 40) "green"
		else if(x < 20) "red"
		else "yellow"
	}
}

class Toy {

}

class BatteryPoweredToy extends Toy with BatteryPower

val battery = new Battery
val toy = new BatteryPoweredToy

println(toy.monitor(50))
println(battery.monitor(80))

val toyComposite = new Toy with BatteryPower

println(toyComposite.monitor(50))