object Same{
    def main(args:Array[String])={
        var arr=Array(1,2,3,4,5,2,3,4)
        var left=0
        var right=arr.length-1
        while (left<right){
            val temp=arr(left)
            arr(left)=arr(right)
            arr(right)=temp
            left+=1
            right-=1
        }
        println(arr.mkString(", "))
    }

}