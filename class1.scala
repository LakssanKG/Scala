class Person(val name:String,val age:Int){}

object Person{
    def apply(data:String):Person={
        val Array(name,age)=data.split(",").map(_.trim)
        new Person(name,age.toInt)
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