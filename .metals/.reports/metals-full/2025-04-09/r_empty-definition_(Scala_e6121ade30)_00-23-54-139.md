error id: ctof.
file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/class2.scala
empty definition using pc, found symbol in pc: ctof.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Temperature.ctof.
	 -Temperature.ctof#
	 -Temperature.ctof().
	 -scala/Predef.Temperature.ctof.
	 -scala/Predef.Temperature.ctof#
	 -scala/Predef.Temperature.ctof().
offset: 492
uri: file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/class2.scala
text:
```scala
import scala.io.StdIn

object Temeperature{
    def ctof(data:Double):Double={
        return (data*9/5)+32
    }
    def ftoc(data:Double):Double={
        return (data-32)*(5.0/9.0)
    }
}

object maiin{
    def main(args:Array[String])={
        println("press 1 for ctof and 2 for ftoc")
        val n=StdIn.readInt()
        println("enter the temperature")
        val temp=StdIn.readInt()
        n match{
            case 1=>
                println(Temperature.ct@@of(temp))

        }
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: ctof.