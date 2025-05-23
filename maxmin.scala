object minmax{
    def main(args:Array[String])={
        var arr=Array(1,2,3,4,5)
        var maxi=arr.max
        var mini=arr.min
        var value=maxi-mini
        println(s"maxi-mini $value")
    }
}