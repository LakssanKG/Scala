error id: scala/Array.
file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/reversesame.scala
empty definition using pc, found symbol in pc: scala/Array.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Array.
	 -Array#
	 -Array().
	 -scala/Predef.Array.
	 -scala/Predef.Array#
	 -scala/Predef.Array().
offset: 68
uri: file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/reversesame.scala
text:
```scala
object Same{
    def main(args:Array[String])={
        var arr=Ar@@ray(1,4,2,5,3,6,3)
        var left=0
        var right=arr.length-1

        while(left<right){
            var temp=arr(left)
            arr(left)=arr(right)
            arr(right)=arr(left)
            left+=1
            right-=1
        }
        println(arr.mkString(", "))
    }
}


```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Array.