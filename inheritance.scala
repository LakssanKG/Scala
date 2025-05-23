class Animal{
    def sound()={
        println("I am animal")
    }
}
class Dog extends Animal{
    override def sound()={
        println("I am dog")
    }
}

object ani{
    def main(args:Array[String])={
        val x=new Dog()
        x.sound()
    }
}