object quick{
    def main(args:Array[String])={
        val arr=List(3,1,5,23,6,9)
        println(quicksort(arr)) 
    }
    
    def quicksort(arr:List[Int]):List[Int]= arr match{
        case Nil=>Nil
        case pivot::tail=>val(left,right)=tail.partition(_ <=pivot)
        quicksort(left):::pivot::quicksort(right)
    }
}