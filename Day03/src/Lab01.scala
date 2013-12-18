object Lab01 {

  def removeAt(position:Int,lst:List[Char]):List[Char] = {
    //removeAt(2,List('a','b','c','d','e')  output is List('a','b','d','e')
    (position,lst) match {
      case (_,Nil) => Nil
      case (0,first::rest) => rest
      case(index:Int,first::rest) => first :: removeAt(index-1,rest)
    }
  }
  def duplicate(lst:List[Char]):List[Char] = {
    lst match {
      case Nil => Nil
      case first :: rest => List(first,first) ::: duplicate(rest)
    }
  }
  def reverse(lst:List[Char]):List[Char] = {
    lst match {
      case Nil => Nil
      case first :: rest => reverse(rest) ::: List(first)
    }
  }
  def main(args: Array[String]): Unit = {
    val lst = List('a','b','c','d','e','f','g','h','i','j','k')
    println(removeAt(1,lst))
    println(reverse(lst))
    println(duplicate(lst))
  }

}