import scala.io.StdIn

object Array{
    def main(args:Array[String])={
        var listt=List(1,2,3,4,5)
        var len=listt.length
        for (i<-0 until len){
            println(listt(i))
        }
        println(listt.mkString(", "))
    }
}