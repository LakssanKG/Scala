
class Employee(val name:String,val salary:Double){
}

object Employee{
    def apply(data:String):Employee={
        val Array(name,salary)=data.split(",").map(_.trim)
        new Employee(name,salary.toDouble)
    }

    def bonus(salary:Double):Double={
        return salary+0.1*salary
    }
}

object Main{
    def main(args:Array[String])={
        val e1=Employee("ash,1000")
        println(Employee.bonus(e1.salary))
    }
}
