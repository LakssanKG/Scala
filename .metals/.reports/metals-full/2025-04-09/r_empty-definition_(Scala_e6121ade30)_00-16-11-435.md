error id: scala/Int#
file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/class1.scala
empty definition using pc, found symbol in pc: scala/Int#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Int#
	 -scala/Predef.Int#
offset: 227
uri: file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/class1.scala
text:
```scala
class Person(name:String,age:Int){}

object Person{
    def apply(data:String):Person={
        var Array(name,age)=data.split(",").trim
        new Person(name,age.toInt)
    }
}

class Person(val name:String,val age:@@Int){
}

object Person{
    def apply(data:String):Person={
        val Array(name,age)=data.split(",")
        new Person(name.trim,age.trim.toInt)
    }
}
object pr{
    def main(args:Array[String])={
        val person1 = new Person("Alice", 25)
        val person2 = new Person("Bob", 30)

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

empty definition using pc, found symbol in pc: scala/Int#