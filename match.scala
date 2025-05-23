object Match{
    def main(args:Array[String])={
        val n=5000
        n match{
            case 10 =>println("ten")
            case 20=>println("twenty")
            case 500=>println("thirty")
            case _=>println("default")
        }
        val nn=add(n,n)
        println(nn)
    }
    def add(x:Int,y:Int) :Int={
        return x+y
    }
}