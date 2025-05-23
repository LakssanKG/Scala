object arm{
    def main(args:Array[String])={
        var n=153
        var str=n.toString().map(_.asDigit)
        var len=n.toString().length
        val result=str.map(math.pow(_,len)).sum.toInt
        print(result)
    }
}