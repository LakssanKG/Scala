import scala.collection.mutable
object InventoryManager{
    val inventory=mutable.Map[String,Int]()
    def addstock(product:String,quantity:Int)={
        inventory(product)=inventory.getOrElse(product,0)+quantity
    }
    def removestock(product:String,quantity:Int)={
        if(inventory.contains(product) && inventory(product)>quantity){
            inventory(product)-=quantity
        }
        else{
            println("insuffient product to remove")
        }
    }
    def getstock(product:String):Int={
        inventory.getOrElse(product,0)
}
}

object main{
    def main(args:Array[String])={
        InventoryManager.addstock("Laptop",10)
        InventoryManager.addstock("Phone",5)
        InventoryManager.addstock("Tab",2)

        InventoryManager.removestock("Laptop",5)
        InventoryManager.removestock("Phone",4)
        InventoryManager.removestock("Tab",3)

        println(InventoryManager.getstock("Laptop"))
        println(InventoryManager.getstock("Phone"))
        println(InventoryManager.getstock("Tab"))
    }
}
