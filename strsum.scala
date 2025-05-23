object strsum{
    def main(args:Array[String])={
        val str = "it 15 is25 a 20string"
        val result="\\d+".r.findAllIn(str).map(_.toInt).sum
        print(result)
    }
}