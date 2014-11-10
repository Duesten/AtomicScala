//1 and 2 TODO
var asd = 0
var dsa = 0
var ads = 0
var sad = 0


for( i <- 0 to 10) {
		asd = asd + i
		}

assert( asd == 55 ,"got " + asd)

for(i <- Range(0,10,2).inclusive){
	dsa = dsa + i
}

assert( dsa == 30,"got " + dsa)

for(i <- Range(0,10).inclusive){

	if(i == 2 || i == 4 || i == 6 || i == 8 || i == 10){
		sad = sad + i
	}

	else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9){
		ads = ads + i
	}
}


println(sad + " " + ads)

sad = 0
ads = 0

for(i <- 0 to 10) {

	if(i == 2 || i == 4 || i == 6 || i == 8 || i == 10){
		sad = sad + i
	}

	else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9){
		ads = ads + i
	}
}

println(sad + " " + ads)

