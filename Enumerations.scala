object MonthName extends Enumeration {
	type MonthName = Value
	val January = Value(1)
	val February,March,April,May,June,July,August,September,October,November,December = Value
	def MonthNumber(a:MonthName) = {a.id}
}

println(MonthName.February)
println(MonthName.February.id)



import MonthName._

def monthNumber(name: MonthName) = {
	name.id

}

// Import not working

def season(name: MonthName) = name match {
	case January | February | December => "Winter"
	case March | April | May => "Spring"
	case June | July | August => "Summer"
	case September | October | November => "Autumn"
}

	
