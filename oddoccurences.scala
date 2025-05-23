object Oddoccurence{
    def main(args:Array[String])={
        val arr=Array(1,2,3,4,5,5,4,3,2,2,2,3,1)
        var result =0
        for (ele<-arr){
            result=result^ele
        }
        println(result)

    }
}