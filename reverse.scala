object reverse{
  def main(args:Array[String])={
    val arr=Array(1,2,3,4,5)
    val reversed=arr.reverse
    println("reversed array:"+ reversed.mkString(", "))
  }
}