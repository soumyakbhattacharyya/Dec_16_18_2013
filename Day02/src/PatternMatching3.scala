object PatternMatching3 {

  def total(lst:List[Int],sum:Int=0):Int = {
    lst match {
      case Nil => sum
      case first :: Nil => sum + first
      case first :: tail => total(tail,sum+first)
      case _ => throw new Exception("You're trying to do something weird")
    }
  }
  
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 31, 12, 53, 75, 88,90,56,23,566,9,577,308,10,5)
    println(total(numbers))
  }

}