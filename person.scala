class person(name:String,age:Int){
    def p()={
        println(name +" "+age)
    }
}

object Per{
    def main(args:Array[String])={
        val x=new person("alex",20)
        x.p()
    }
}