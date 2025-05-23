error id: scala/collection/immutable/List#map().
file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/map_flatmap.scala
empty definition using pc, found symbol in pc: scala/collection/immutable/List#map().
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -sentences/map.
	 -sentences/map#
	 -sentences/map().
	 -scala/Predef.sentences.map.
	 -scala/Predef.sentences.map#
	 -scala/Predef.sentences.map().
offset: 140
uri: file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/map_flatmap.scala
text:
```scala
object map{
    def main(args:Array[String])={
        val sentences = List("Hello wor", "Scala is great")
        val words=sentences.ma@@p(_.split(" ").toList.filter(_.length>3))
        print(words.mkString(" "))
    }  
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/collection/immutable/List#map().