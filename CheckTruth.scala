def checkTruth( exp1:Boolean, exp2:Boolean):String = exp1 match {
  case true=>
    if (exp2) "Both are true"
    else "First: true, second: false"
  case false=>
    if (exp2) "First: false, second: true"
    else "Both are false"

  }
