object Functions1 {
 def square(num:Int,lunch:Int=>Int):Unit = {
    println(lunch(num))
  }
  
  def square2(output:Int=>Unit,num:Int,lunch:Int=>Int):Unit = {
    output(lunch(num))
  }
  
 
  def main(args: Array[String]): Unit = {
    square2({x:Int=>println(x)},56,{x:Int=>x*x})
    
    
    
    
    
    
    
    
	val logic = {x:Int => x*x}	  
    square(3,logic)
    
    
    
    def f = { println("What the hell is this?")}
	//f
    
	val add = {(x:Int,y:Int) => x + y }
    
    println(add(14,15))
    
    val code3 = {x:Int => println(x)}//Defining an anonymous class 
    println(code3)

    code3(10000)//creating an instance of THAT class
    code3(1000045)
    code3(450000)
    
    
    
    
    
    
    
    
    
    val mycode2 = {
      println("Scratching my head")
      println("Need some food")
    }
    
    
    val mycode1 = { println("Hello World") }
    
  }

}