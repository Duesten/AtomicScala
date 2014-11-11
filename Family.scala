class Family(asd:String*){

	def getFamilySize:Int = {
		var familySize = 0
		for(x <- asd){println(x) ; familySize = familySize + 1}
		
		familySize

	}
	
}

val a = new Family("a","b","c")

println(a.getFamilySize)


class FamilyExt(mom:String,dad:String,children:String*){

	def getFamilySize:Int = {
		var familySize = 0
		for(x <- children){println(x) ; familySize = familySize + 1}
		
		{familySize + 2}

	}
	
}

val asd = new FamilyExt("Mom","Dad","Son","Daughter","Adopted kid")
println(asd.getFamilySize)

val ads = new FamilyExt("Mom","Dad")

println(ads.getFamilySize)
