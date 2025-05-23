error id: scala/Predef.identity().
file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/oddoccur.scala
empty definition using pc, found symbol in pc: scala/Predef.identity().
semanticdb not found
empty definition using fallback
non-local guesses:
	 -identity.
	 -identity#
	 -identity().
	 -scala/Predef.identity.
	 -scala/Predef.identity#
	 -scala/Predef.identity().
offset: 341
uri: file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/oddoccur.scala
text:
```scala
object odd{
    def main(args:Array[String])={
        val arr=Array(1,1,1,2,2,3,3,4,4,4,5,5,5,5,6,6,6,7,7,7)
        val arr1=arr.distinct
        var result=List[Int]()
        for(ele<-arr1){
            if(arr.count(_==ele)%2!=0){
                result=result :+ ele
            }
        }
        var result1=arr.groupBy(ide@@ntity).collect{ case(x,xs) if xs.size%2!=0 =>x }
        println(result1.mkString(", "))
        println(result.mkString(", "))
        var result=arr.groupBy()
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Predef.identity().