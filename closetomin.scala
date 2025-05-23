object close{
    def main(args:Array[String])={
        val arr=Array(-1,3,8,-4,5,-6)
        var left=0
        val sorted=arr.sorted
        var right=sorted.length-1
        var minsum=Int.MaxValue
        var minpair=(0,0)
        while(left<right){
            var sum=sorted(left)+sorted(right)
            if (math.abs(sum)<minsum){
                minsum=sum
                minpair=(sorted(left),sorted(right))
            }
            if (sum<0) left+=1 else right-=1
        }
        println(s"minimum difference is $minsum and value 1 is ${minpair._1} value 2 is ${minpair._2}")
    }
}

