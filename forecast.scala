def forecast(t: Int):String = {
	t match {
       case 100 => "Sunny"
       case 80 => "Mostly Sunny"
       case 50 => "Partly Sunny"
       case 20 => "Mostly Cloudy"
       case 0 => "Cloudy"
       case _ => "Unknown"
	}
}
