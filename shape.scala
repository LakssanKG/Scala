class shape{
    private var length=5
    var width=4
    def p()={
        println(length)
    }
}
object what{
    def main(args:Array[String])={
        var rect =new shape()
        rect.p()
        println(rect.width)
    }
}