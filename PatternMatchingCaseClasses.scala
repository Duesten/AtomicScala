// PatternMatchingCaseClasses.scala
import com.atomicscala.AtomicTest._

case class Passenger(
  first:String, last:String)
case class Train(
  travelers:Vector[Passenger],
  line:String)
case class Bus(
  passengers:Vector[Passenger],
  capacity:Int)
case class Plane(travelers:Vector[Passenger],
  name:String)
case class Kitten(name:String)



def travel(transport:Any):String = {
  transport match {
    case Train(travelers, line) =>
      s"Train line $line $travelers"
    case Bus(travelers, seats) =>
      s"Bus size $seats $travelers"
    case Plane(travelers, name) =>
      s"Plane $name with $travelers passengers"
    case Passenger(first,last) => s"$first is walking along"
    case what => s"$what is in limbo!"
  }
}

val travelers = Vector(
  Passenger("Harvey", "Rabbit"),
  Passenger("Dorothy", "Gale"))

val trip = Vector(
  Train(travelers, "Reading"),
  Bus(travelers, 100),
  Plane(travelers,"B757"))

println(travel(trip(2)))
println(travel(Passenger("Sally","Culo")))
println(travel(Kitten("Ludovico")))