object maxprod{
    def main(args:Array[String])={
         val nums = Array(2, 3, 5, 7, -7, 5, 8, -5)
         var maxi=Int.MinValue
         for(i<-0 until nums.length){
            for(j<-0 until nums.length){
                if(i!=j){
                    if (nums(i)*nums(j)>maxi){
                        maxi=nums(i)*nums(j)
                    }
                }
            }
         }
         println(maxi)
    }
}