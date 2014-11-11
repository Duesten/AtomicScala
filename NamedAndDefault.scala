class SimpleTime(var hours:Int,var minutes:Int = 0){

}

var asd = new SimpleTime(hours=10,minutes=5)
println(asd.hours)

var asd1 = new SimpleTime(hours=5)
println(asd1.hours)
println(asd1.minutes)

class Planet(var name:String,var description:String,var moons:Int = 0){

	def hasMoon:Boolean = {
		if(moons > 0){true} else {false}
	}
}

var planet1 = new Planet(description = "asd",name = "ads")
println(planet1.hasMoon)
println(planet1.description)

class Item(name:String,price:Double){
	var cost = 0.0
	def cost(grocery:Boolean = false,medication:Boolean = false, taxRate:Double = 0.10):Double = {
		if(medication == true || grocery == true){
			cost = price
			cost
		}else {cost = price + price*taxRate;cost}
	}
}

var shiet = new Item("shiet",500)

println(shiet.cost(taxRate=0.06))

