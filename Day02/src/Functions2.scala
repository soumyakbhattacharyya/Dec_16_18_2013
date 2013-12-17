object Functions2 {

  def math(limit:Int) (condition:Int=>Boolean):Unit = {}
  def sum(a:Int,b:Int,c:Int):Int = a + b + c
  def add(a:Int) (b:Int) (c:Int):Int = a + b + c
  
  def main(args: Array[String]): Unit = {
    math(10) {x:Int=>x%2 == 0}
    
    add (1) (2) (3)
    sum(1,2,3)
    
    //args.foreach({x=>println(x)})
    //args.foreach {x=>println(x)}
  }

}