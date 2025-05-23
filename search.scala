object sear{
    def main(args:Array[String])={
        val arr=List(1,2,4,5,6,7,8)
        val target=6
        val found= search(arr,target)
        if (found){
            println("we found")
        }
        else{
            println("no")
        }
    }
    def search (arr:List[Int],target:Int):Boolean= arr match{
    case Nil=>false
    case head::tail=>
        if(head==target) return true
        else return search(tail,target)
   }
}