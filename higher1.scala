object h1{
    def main(args:Array[String])={
        val result=math(50,10,2,(x,y)=>x*y)
        println(result)
    }
    def math(x:Int,y:Int,z:Int,f:(Int,Int)=>Int):Int={
        f(f(x,y),z)
    }   
}