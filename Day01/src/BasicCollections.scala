object BasicCollections {

  def main(args: Array[String]): Unit = {
    val langs = Map(1->"Java",2->"C#",3->"Scala")
    println(langs(1))
    println(langs(2))
    println(langs.getClass)
    //println(langs(4)) ERROR
    
    langs.keys.foreach {key=>println(langs(key))}
    	
    val set1 = Set("C#")
   // set1 += "Java"
  //  set1 += "F#"
    
      val lst1:List[Int] = List(100,200,300,400)
    val lst2 = List("C#","F#","Scala","Groovy")
    lst2.foreach {item=>println(item)}
    
    val arr = Array(1,2,3,4)
    println(arr(0))
    println(arr(1))
    arr.foreach { i=>println(i) }
  }

}
