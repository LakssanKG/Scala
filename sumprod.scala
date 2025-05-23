object sumprod{
    def main(args:Array[String])={
        var list=List(1,2,3,4,5,5,3,1)
        val words = List("apple", "banana", "cherry", "date")
        var sum=0
        var prod=1
        for(i<-list){
            println(i)
            sum+=i
            prod*=i
        }
        var f=words.filter(_.length>4)
        println(f)
        println(s"sum $sum")
        println(s"product $prod")

        var odd=list.filter(_%2!=0).sum
        println(odd)

        var rmduplicates=list.distinct
        println(rmduplicates.mkString(" "))

        var list1=List(1,2,5,4)
        val diff=list.diff(list1)
        println(diff.mkString(" "))

    }
}