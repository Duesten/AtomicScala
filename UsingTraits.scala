trait Wifi {
	def status = "Working"
	val address : String
}

class Camera{
	def showImage = "Showing video"
}

class WifiCamera extends Camera with Wifi{

	val address = "192.168.0.200"
}

val webcam = new WifiCamera

println(webcam.showImage , webcam.status , webcam.address)

trait Connections {
  val maxConnections = 5
  var connected = 0

  def connect(connection: Boolean) = {
    connection match {
      case true =>
        if (connected < maxConnections) {
	      connected = connected + 1
	      true
	    }
	    else false
      case false =>
	    if (connected > 0) {
	      connected = connected - 1
	      true
	    }
	    else false

	  }
  }
}

val c = new Object with Connections
println(c.maxConnections)
println(c.connect(true))
println(c.connected)
for (i <- 0 to 3)
  println(c.connect(true))
println(c.connect(true))
println(c.connect(false)) 
println(c.connected) 
for (i <- 0 to 3)
  println(c.connect(false)) 
println(c.connected)
println(c.connect(false))


class WifiCameraWithConnetions extends WifiCamera with Connections{

}


val c2 = new WifiCameraWithConnetions
println(c2.maxConnections)
println(c2.connect(true) , c2.connected, c2.connect(false), c2.connected , c2.connect(false))

trait ArtPeriod {
	var y:Int
  def show = {
     y match {
       case y: Int if y < 1300 => "Pre-Renaissance"
       case y: Int if y >= 1300 && y < 1600 => "Renaissance"
       case y: Int if y >= 1600 && y < 1700 => "Baroque"
       case y: Int if y >= 1700 && y < 1790 => "Late Baroque"
       case y: Int if y >= 1790 && y < 1880 => "Romanticism"
       case y: Int if y >= 1880 && y < 1970 => "Modern"
       case _ => "Contemporary"
     }
  }
}

// val pe = new Object with ArtPeriod

// println(pe.show(1400),pe.show(1650),pe.show(1279))

class Painting(val year:Int) extends ArtPeriod{
	var y:Int = year
}

val a = new Painting(1800)
println(a.show)


