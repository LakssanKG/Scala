object Main{
    def main(args:Array[String])={
        // val sentence="The quick brown fox jumps over a lazy dog"
        // print(sentence.toLowerCase.filter(_.isLetter).distinct.length)
        val arr=Array(1,2,3,4,5)
        val result=arr.takeWhile(_!=3)
        print(result.mkString(", "))
    }
}