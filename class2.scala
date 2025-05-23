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
                println(Temeperature.ctof(temp))
            case 2=>
                println(Temeperature.ftoc(temp))
            case _=>
                println("invalid options")

        }
    }
}