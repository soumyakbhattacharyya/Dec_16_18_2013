class ScalaFromCTS {
   def confuse():(Int=>Int) = {
     {x:Int => x*x}
   }	
   @Deprecated def better = "Better"
     
   def good(logic:Int=>Int):Int = {
     logic(10)
   }
   def bad(tpl:(Int,Int)) = s"What the hell is this? ${tpl._1} ${tpl._2}"
   def ugly = "Ugly dance"
}