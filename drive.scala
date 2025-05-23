import scala.io.StdIn

object driv{
    def main(args:Array[String])={
        println("enter the name")
        val name=StdIn.readLine()
        println("enter the age")
        val age=StdIn.readInt()

        if (age>16){
            printf(s" $name ready to drive")
        }
        else{
            printf(s"$name need to wait ${16-age} to drive")
        }
    }
}