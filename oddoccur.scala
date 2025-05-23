object odd{
    def main(args:Array[String])={
        var arr=Array(1,1,1,2,2,3,3,4,4,4,5,5,5,5,6,6,6,7,7,7)
        val arr1=arr.distinct
        var result=List[Int]()
        for(ele<-arr1){
            if(arr.count(_==ele)%2!=0){
                result=result :+ ele
            }
        }
        var result1=arr.groupBy(identity).collect{ case(x,xs) if xs.size%2!=0 =>x }
        println(result1.mkString(", "))
        println(result.mkString(", "))
    }
}