class Tea(val name:String = "awesomeTea", val decaf:Boolean = false , val sugar:Boolean = true, val milk:Boolean = true)
{
	var cals = 0
	def describe:String = {
		name + {if(decaf){" + decaf "}} + {if(sugar){" + sugar "}} + {if(milk){ " + milk "}}
	}
	def calories:Int = {
		if(milk){cals += 100}
		if(sugar){cals += 16}
		cals
	}
}

val asd = new Tea("stuffy", decaf = true , sugar = true, milk = true)
println(asd.calories)
println(asd.cals)
println(asd.describe)

