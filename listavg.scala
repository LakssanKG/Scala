import scala.io.StdIn
object Avg{
    def main(args:Array[String])={
        println("enter the no of students")
        val n=StdIn.readInt()
        val marks=new Array[Int](n)
        for (i<-0 until n){
            println(s"enter the matks for student $i")
            val x = StdIn.readInt()
            marks(i)=x
        }
        val average=marks.sum.toDouble/n
        println(s"average: $average")
        val number=marks.count(_<average)
        if (number>2){
            println(println(s"$number students scored below the class average."))
        }
    }
}




