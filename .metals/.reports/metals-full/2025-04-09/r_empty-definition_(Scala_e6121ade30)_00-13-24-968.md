error id: _empty_/Person#
file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/class1.scala
empty definition using pc, found symbol in pc: _empty_/Person#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Person#
	 -scala/Predef.Person#
offset: 128
uri: file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/class1.scala
text:
```scala


object pr{
    def main(args:Array[String])={
        val person1 = new Person("Alice", 25)
        val person2 = new Per@@son("Bob", 30)

        // Creating objects using `apply()` method from the companion object
        val person3 = Person("Charlie,40")
        val person4 = Person("David, 22") // Handles extra spaces

        // Printing results
        println(person1.name)
        println(person2.name)
        println(person3.name)
        println(person4.name)
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/Person#