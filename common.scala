object Common{
    def main(args:Array[String])={
        val arr1=Array(1,2,3,4,5)
        val arr2=Array(2,3,6,9,1)
        val common = arr1.intersect(arr2)
        println("common elements "+ common.mkString(", "))
    }
}