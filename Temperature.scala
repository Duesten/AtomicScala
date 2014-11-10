class Temperature{
	var current = 0.0
	var scale = "f"
	def setFahrenheit(now:Double):Unit = {current = now; scale = "f"}
	def setCelsius(now:Double):Unit = {current = now; scale = "c"}
	def setKelvin(now:Double):Unit = {current = now; scale = "k"}
	def getFahrenheit():Double = {if(scale == "f"){current}else if(scale == "c") {current*9.0/5.0+32.0} else {(getKelvin() - 273.15) * 1.8000 + 32 }}	
	def getCelsius():Double = {if(scale == "c"){current}else if (scale == "f" ) {(current - 32.0) * 5.0/9.0} else {getKelvin() - 273.15}} 
	def getKelvin():Double = {if(scale == "c"){getCelsius+273.15}else if(scale == "k"){current}else{(current-32)/ 1.8000 + 273.15}}
}

val a = new Temperature

a.setCelsius(100)
println(a.getCelsius + " " + a.getKelvin +" "+ a.getFahrenheit)
a.setKelvin(373)
println(a.getCelsius + " " + a.getKelvin +" "+ a.getFahrenheit)
a.setFahrenheit(212)
println(a.getCelsius + " " + a.getKelvin +" "+ a.getFahrenheit)

