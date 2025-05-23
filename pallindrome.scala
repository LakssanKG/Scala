object palli{
    def main(args:Array[String])= {
        var list=List(1,2,3,2,1,0)
        if (list==list.reverse){
            println("pallindrome")
        }
        else{
            println("not")
        }
        val str="programming"
        var duplicates=list.groupBy(identity).collect{ case (x,xs) if xs.size >1=>x}
        println(str.substring(2,8))
        val duplicatesstring = str.toList.groupBy(identity).collect{ case (x, xs) if xs.size > 1 => (x, xs.size) }
        println(duplicates.mkString(" "))
         val lst2 = List(1,2,3,4);
         var n=123321
         var rev=0
         while(n>0){
            rev=rev*10+n%10
            n=n/10
         }
         print(rev)
    }
}