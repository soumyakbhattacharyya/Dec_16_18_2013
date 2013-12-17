object PatternMatching1 {

  def main(args: Array[String]): Unit = {
    var someValue:Any = "dummy"

   println (
    someValue match {
      case "java" => "Yuck"
      case <Language>Java</Language> => "Heavy"
      case 0 => 0
      case List(1,2,3,4,5,5,6) => "It;s a long list"
      case (1,"Java") => true
      case List(1,2,3) => "It;s a list"
      case _ => "What the hell is it then?"
    }
   )
      
      
      
    val i:Int = 12
    
    val output = i match {
			      case 0 => "It's a duck"
			      case 100 => "Century"
			      case _ => "Cool"
			    }
    println(output)
  }

}