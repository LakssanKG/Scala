object posneg{
    def main(args:Array[String])={
        var list=List(1,2,3,1,-8,-8)
        println(list.filter(_<0).product)
        println(list.filter(_>0).sum)
    }
}