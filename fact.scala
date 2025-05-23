object fact{
    def main(args:Array[String])={
        println(factorial(6))
        val x=(1,"asdfas",3)
        print(x._2)
    }
    def factorial(x:Int):Int={
        if (x==1){
            return 1
        }
        else{
            return x*factorial(x-1)
        }
    }
}