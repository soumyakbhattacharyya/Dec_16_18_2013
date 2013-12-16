object Basics1 {
	def voidFunction3():Unit = {
	  
	}
	def voidFunction1(){
	  
	}
	def +():Unit = {
	  
	}
	
	def add(num1:Int,num2:Int):Int = {
	  //num1 = 200	//ERROR
	  num1 + num2
	}
	def functionName(arg1:Int,arg2:String):String = {
			return "Hello"
	}
  def main(args: Array[String]): Unit = {
    var num1 = 10
    //num1++
    //++num1
    
    var num2 = 20
    var num3 = num1 + num2
    num3 = num1.+(num2)

    val str:String = "Scala"
    //str = "Groovy"
    var a = 1000
    //a = "Hello"
    println(a.getClass)
    var i:Int = 100
    println(i.getClass.getName)
    println(i.toString)
    var b:Boolean = false
    var d:Double = 10.34
    println(d.round)
    
  }

}