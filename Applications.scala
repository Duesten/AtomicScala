trait EnergySource

trait BatteryPower {
 def monitor(charge: Int) : String = {
   if (charge < 20) "red"
   else if (charge < 40) "yellow"
   else "green"
 }
}

class Battery1 extends EnergySource with BatteryPower

object Battery1 extends App {
  val battery = new Battery1
  println(battery.monitor(20))
}
