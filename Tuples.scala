val tuple1 = (65, "Sunny", "Stars")
val (temp,sky,view) = tuple1
println(temp,sky,view)

val tuple2 = (40,"Cloudy","Satellites")
val (temp1,sky1,view1) = tuple2

val tuple3 = (51,"Blue","Night")
val (temp2,sky2,view2) = tuple3

println(temp2,sky1,view,sky2)

val info = (50,45)
println(info._1,info._2)

def weather(temp:Int,humidity:Int) = {
	
	(temp,humidity) match {
	 	case (temp,humidity) if(temp > 80 && humidity > 40) => ("Hot","Humid")
	 	case (temp,humidity) if(temp < 50 && humidity > 40) => ("Cold","Damp") 
	 	case (temp,humidity) if(temp > 80 && humidity < 40) => ("Hot","Pleasant") 
	 	case (temp,humidity) if(temp < 50 && humidity < 40) => ("Cold","Pleasant") 
	 	case (temp,humidity) if(temp >= 50 && temp <= 80 && humidity > 40) => ("Temperate","Humid")
	 	case (temp,humidity) if(temp >= 50 && temp <= 80 && humidity < 40) => ("Temperate","Pleasant")
	 	case _ => ("Unknown","Unknown")
	 }

}

println(weather(82,53))
println(weather(50,45))

val (heat1,moisture1) = weather(81,45)
println(heat1,moisture1)
val (heat2,moisture2) = weather(27,55)
println(heat2,moisture2)


