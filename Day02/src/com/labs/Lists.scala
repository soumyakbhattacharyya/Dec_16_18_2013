package com.labs

object Lists {
  def main(args: Array[String]): Unit = {
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