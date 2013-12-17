object PartiallyAppliedFunctions {

  def math(logic:Int=>Boolean = {_ => true}):Unit = {
    
  }
  def doSomething:Any = {
    //2
    "2"
    true
  }
  def add(a:Int,b:Int,c:Int):Int = a + b + c
  
  def main(args: Array[String]): Unit = {
		val partialSum = add(10,_:Int,20)
		println(partialSum)
		partialSum(30)
  }

}