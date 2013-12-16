object Basics2 {

  def main(args: Array[String]): Unit = {
    val city1:(String,String) = ("Kolkata","India")
    
    val player1 = ("MS Dhoni",31,"Ranchi","Plays Cricket")
    println(player1.getClass)
    
    val person1 = ("Sam",35)
    println(person1._1 + ", " + person1._2)
    println(person1.getClass)
    
    val book1 = ("ABC",400,"14$")
    println(book1._1 + ", " + book1._2 + ", " + book1._3)
    println(book1.getClass)
  }

}