object Removeelements{
    def main(args:Array[String])={
        val list1=List(1,2,3,4,5,6,7,8,9)
        val list2=list1.filter(_!=5)
        val list3=list1.diff(List(2,3,4))
        println(s"removing one element ${list2.mkString(" ")}")
        println(s"removing multiple elements ${list3.mkString(" ")}")
    }
}