case class Bicycle(riders:Int){
	override def toString = "Bycicle for two"  
	
}

println(Bicycle(3))


case class Cycle(wheels:Int){
	override def toString = {
		wheels match {
			case 1 => "Unicycle"
			case 2 => "Bicycle"
			case 3 => "Tricycle"
			case 4 => "QuadBomb"
			case t if(t>0) => s"Superwheeled with $wheels wheels" 
			case _ => "U high"
		}
		
	}
	
}

println(Cycle(-2))

