object comp{
    def main(args:Array[String])={
       var arr=Array('a','a','a','b','c','c','c','a','a','d','d','e','f') //a,b,c,a,d

       for(i<-0 until arr.length-1){
        if(arr(i)!=arr(i+1)){
            println(arr(i))
        }
       }
       println(arr(arr.length-1))
    }
}