object map{
    def main(args:Array[String])={
        val sentences = List("Hello wor", "Scala is great")
        // val words=sentences.flatMap(_.split(" ").toList.filter(_.length>3))
        // print(words.mkString(" "))
        val x=sentences.flatMap(_.split(" ").toList.filter(_.length>3))
        print(x.mkString(", "))
    }
}