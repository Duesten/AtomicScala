// OneOrTheOther.scala
import com.atomicscala.AtomicTest._

def oneOrTheOther(exp:Boolean):String = {
	exp match{
		case true => "True!"
		case false => "False!"
	}
}

assert(oneOrTheOther(true)=="True!")
assert(oneOrTheOther(false)=="False!")