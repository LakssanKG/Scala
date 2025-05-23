error id: scala/io/StdIn#readInt().
file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/drive.scala
empty definition using pc, found symbol in pc: scala/io/StdIn#readInt().
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -scala/io/StdIn.readInt.
	 -scala/io/StdIn.readInt#
	 -scala/io/StdIn.readInt().
	 -StdIn.readInt.
	 -StdIn.readInt#
	 -StdIn.readInt().
	 -scala/Predef.StdIn.readInt.
	 -scala/Predef.StdIn.readInt#
	 -scala/Predef.StdIn.readInt().
offset: 201
uri: file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/drive.scala
text:
```scala
import scala.io.StdIn

object driv{
    def main(args:Array[String])={
        println("enter the name")
        val name=StdIn.readLine()
        println("enter the age")
        val age=StdIn.@@readInt()

        if (age>16){
            printf(s" $name ready to drive")
        }
        else{
            printf(s"$name need to wait ${16-age} to drive")
        }
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/io/StdIn#readInt().