object msort{
    def main(args:Array[String])={
        val arr=List(1,4,5,3,1,0,4,3,5,5,3)
        println(mergesort(arr))
    }
    def mergesort(arr:List[Int]):List[Int]={
        if (arr.length==1) arr
        else{
            val mid=arr.length/2
            val (left,right)=arr.splitAt(mid)
            merge(mergesort(left),mergesort(right))
        }
    }
    def merge(left:List[Int],right:List[Int]):List[Int]=  (left,right) match{
        case (Nil,_)=>right
        case (_,Nil)=> left
        case (lhead::ltail,rhead::rtail)=>
            if (lhead<=rhead) lhead :: merge(ltail,right)
            else rhead :: merge(left,rtail)

    }
}