
sealed trait Color
case object Red extends Color
case object Green extends Color
case object Blue extends Color
object Color {
  val values = Vector(Red, Green, Blue /*, Purple*/ )
}

def display(c:Color) = c match {
  case Red => s"It's $c"
  case Green => s"It's $c"
  case Blue => s"It's $c"
}


println(Color.values.map(display))

//value Purple not found if Purple is in values vector


object EnumColor extends Enumeration {
  type EnumColor = Value
  val Red, Green, Blue = Value
}

println( EnumColor.Red ,
EnumColor.Blue ,
EnumColor.Green )	

//get error : Red is already defined as value Red
//get error : Red is already defined as case class Red

