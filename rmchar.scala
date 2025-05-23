import scala.io.StdIn

object Rmchar{
    def main(args:Array[String])={
        println("enter a string")
        val str=StdIn.readLine()
        println("enter the char")
        val ch=StdIn.readChar()
        val ans=new StringBuilder
        var i=0
        while (i<str.length){
            if (!((i>0 && str(i-1)==ch) || (str(i)==ch) || (i<str.length-1 && str(i+1)==ch))){
                ans.append(str(i))
            }
            i+=1
        }
        println(ans.toString())
    }
}