package com.labs

object Lists {

  def main(args: Array[String]): Unit = {
    val alphabets = "A" :: "B" :: "C" :: Nil
    
    val numbers = List(1, 31, 12, 53, 75, 88,90,56,23,566,9,577,308,10,5)
    println(numbers.map {x=>x*x})
    
    //Imperative style
    var sum:Int = 0
    numbers.foreach {num => if(num%2 == 0) sum += num}
    
    println(sum)
    println(numbers.filter(num=> num%2 == 0).sum)//Functional Style
    
    
    
	val lst1 = List("Java","C#","Scala","Groovy")
	println(lst1.reverse)
	println(lst1.slice(1, 3))
	
	val lst2 = "Ruby" :: lst1   //prepend
	val lst3 = lst1 :+ "Erlang"  //append

    lst1.head //Java
    lst1.tail //List("C#","Scala","Groovy")
    lst1(1) //C#
	lst1.contains("Scala") //true
	lst1.tail(2)  //Groovy
	lst1.tail.head //C#
	lst1.isEmpty //false
    
    
    
  }
}