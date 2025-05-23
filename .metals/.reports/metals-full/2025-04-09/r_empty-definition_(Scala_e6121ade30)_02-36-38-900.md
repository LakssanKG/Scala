error id: scala/Int.
file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/maxprod.scala
empty definition using pc, found symbol in pc: scala/Int.
semanticdb not found
empty definition using fallback
non-local guesses:
	 -Int.
	 -scala/Predef.Int.
offset: 157
uri: file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/maxprod.scala
text:
```scala
object maxprod{
    def main(args:Array[String])={
         val nums = Array(2, 3, 5, 7, -7, 5, 8, -5)
         println(nums.drop(6))
         var maxi=I@@nt.MinValue
         for(i<-0 until nums.length){
            for(j<-0 until nums.length){
                if(i!=j){
                    if (nums(i)*nums(j)>maxi){
                        maxi=nums(i)*nums(j)
                    }
                }
            }
         }
         println(maxi)
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Int.