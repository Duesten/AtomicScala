case class Activity(date:String,activity:String){
	
}

var activityVector = Vector(Activity("1","Run"),Activity("2","Ski"),Activity("3","Run"),Activity("1","Bike"))

def yieldActivityDates(v:Vector[Activity],a:String):Vector[String] = {
	for( x <- v ; if(x.activity == a)) yield x.date

}

println(yieldActivityDates(activityVector,"Run"))

def yieldActivityFromDate(v:Vector[Activity],d:String):Vector[String] = {
	for(x <- v; if(x.date == d)) yield x.activity
}


println(yieldActivityFromDate(activityVector,"1"))


