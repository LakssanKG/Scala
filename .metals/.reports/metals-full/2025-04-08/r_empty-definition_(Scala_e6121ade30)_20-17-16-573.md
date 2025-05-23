error id: scala/Array#length().
file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/compress.scala
empty definition using pc, found symbol in pc: scala/Array#length().
semanticdb not found
empty definition using fallback
non-local guesses:
	 -arr/length.
	 -arr/length#
	 -arr/length().
	 -scala/Predef.arr.length.
	 -scala/Predef.arr.length#
	 -scala/Predef.arr.length().
offset: 264
uri: file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/compress.scala
text:
```scala
object comp{
    def main(args:Array[String])={
       var arr=Array('a','a','a','b','c','c','c','a','a','d','d') //a,b,c,a,d

       for(i<-0 until arr.length-1){
        if(arr(i)!=arr(i+1)){
            println(arr(i))
        }
        if(i==arr.length@@-1){
            println(arr(i))
        }
       }
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Array#length().