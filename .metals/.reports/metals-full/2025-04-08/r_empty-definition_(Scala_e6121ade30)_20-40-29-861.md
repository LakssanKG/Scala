error id: scala/collection/immutable/List#flatMap().
file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/map_flatmap.scala
empty definition using pc, found symbol in pc: scala/collection/immutable/List#flatMap().
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -sentences/flatMap.
	 -sentences/flatMap#
	 -sentences/flatMap().
	 -scala/Predef.sentences.flatMap.
	 -scala/Predef.sentences.flatMap#
	 -scala/Predef.sentences.flatMap().
offset: 258
uri: file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/map_flatmap.scala
text:
```scala
object map{
    def main(args:Array[String])={
        val sentences = List("Hello wor", "Scala is great")
        // val words=sentences.flatMap(_.split(" ").toList.filter(_.length>3))
        // print(words.mkString(" "))
        val x=sentences.flatM@@ap(_*2)
        print(x.mkString(", "))
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/collection/immutable/List#flatMap().