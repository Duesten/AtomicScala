class WalkActivity{
	def calories(lbs:Int, mins:Int, mph:Double = 3) = {
		WalkActivity.calories(lbs,mins,mph)
	}
}

object WalkActivity{
	
	var log =""
	def start(who:String) = {log += s"[$who] Activity started " ; println(s"[$who] started")}
	def stop(who:String) = {log += s"[$who] Activity stopped"}
	def calories(lbs:Int, mins:Int,mph:Double = 3):Long = math.round((MET(mph) * 3.5 * lbs * 0.45)/200.0 * mins) 

	def MET(mph: Double) = mph match{
		case x:Double if(x < 1.7) => 2.3
		case x:Double if(x < 2.5) => 2.9
		case x:Double if(x < 3) => 3.3
		case x:Double if(x >= 3) => 3.3
		case _ => 2.3
	}
}



WalkActivity.start("Sally")
WalkActivity.start("Dawg")
WalkActivity.start("Jim")
WalkActivity.stop("Jim")
println(WalkActivity.log)

val sally = WalkActivity
println(sally.calories(150,30))

val suzie = new WalkActivity
println(suzie.calories(150,30))
val john = new WalkActivity
println(john.calories(150,30,1.5))