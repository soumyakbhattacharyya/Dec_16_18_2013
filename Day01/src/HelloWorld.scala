object HelloWorld {
	def doSomethingElse(numbers:Array[Int],logic:Int=>Boolean):Unit = {
	  numbers.foreach {i =>
	    if(logic(i))
	    	println(s"${i} is even number")
	    else if(i % 2 != 0)
	      println(s"${i} is odd number")
	  }
	  /*for(i <- 1 to 10){
	    if(i % 2 == 0)
	    	println(s"${i} is even number")
	    else if(i % 2 != 0)
	      println(s"${i} is odd number")
	  }*/
	}
	def main(args:Array[String]):Unit = {
	  doSomething()
	  doSomethingElse(Array(1,32141,3242,13,377,32413212),
	      {num:Int=>num%2 == 0})
	  //doSomethingElse(Array(1,32141,3242,13,377,32413212))
	}
	def doSomething():Unit = {
	  for(i <- 1 to 5; if(i%2 == 0))
		  println(s"Hello World: ${i}")
	}
	
}