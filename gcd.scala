object gc{
    def main(args:Array[String])={
        println(gcd(120,20))
    }

    def gcd(a:Int,b:Int):Int={
        if(b==0){
            return a
        }
        else{
            return gcd(b,a%b)
        }
    }
}