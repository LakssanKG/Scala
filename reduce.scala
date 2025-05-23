object red{
    def main(args:Array[String])={
        var arr=Array(1,2,3,4,5)
        var res1=arr.reduceRight(_-_)
        println(res1)
    }
}