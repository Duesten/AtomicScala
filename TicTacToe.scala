// TicTacToe.scala
import com.atomicscala.AtomicTest._

class Cell {
  var entry = '~'
  def set(e:Char):String = {
    if(entry=='~' && (e=='X' || e=='O')) {
      entry = e
      "successful move"
    } else
      "invalid move"

  }

  def get():Char = {
    entry
  }
}

class Grid {
  val gameDone = false
  val cells = Vector(
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell)
  )
  def play(e:Char, x:Int, y:Int):String = {
    if(x < 0 || x > 2 || y < 0 || y > 2){
      var ads = "invalid move" ; display() ; return ads}
    else{
      var asd = cells(x)(y).set(e)
      display(); return asd
    }
      
  }

  def isGameDone():Unit = {
    //check vertically
    for(x <- 0 to 2){
      println("checking hor" )
      if((cells(x)(0).get == 'O' && cells(x)(1).get == 'O' && cells(x)(2).get == 'O')||(cells(x)(0).get == 'X' && cells(x)(1).get == 'X' && cells(x)(2).get == 'X')){
        
        println("Yup")
      }
    }
    
    for(y <- 0 to 2){
      println("checking ver")
      if((cells(0)(y).get == 'O' && cells(1)(y).get == 'O' && cells(2)(y).get == 'O')||(cells(0)(y).get == 'X' && cells(1)(y).get == 'X' && cells(2)(y).get == 'X')){
        
        println("Yup")

      }
    }
  }

  def display() = {
    for(i <- 0 to 2){
      for (j <- 0 to 2){
        print(cells(j)(i).get + " " + j + i + " ")
      }
      println(" ")
    }
    
  }
}

val grid = new Grid

grid.play('O',1,0)
grid.play('O',1,1)
grid.play('O',1,2)
grid.isGameDone
