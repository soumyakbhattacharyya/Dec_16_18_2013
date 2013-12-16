package com.labs

object Lab02 {
  
  def main(args: Array[String]): Unit = {
		  Console.println("Hello World")
		  Console println "Hello World"
		   this + (1,2) _2 (1)
		  
		  Lab02.+((1,2))
		  Lab02 + (1,2)
		  
		  val result1 = Lab02 + (1,2) //Same as this.+(1,2) 
		  val result2 = Lab02 - (1,3)
		  val result3 = Lab02 * (34,45)
		  val result4 = Lab02 / (44,2)
  }
  
  def *(numbers:(Int,Int)):(String,Array[Int],Int) = {
    val arg1 = "*"
    val numbersArr = Array(numbers._1,numbers._2)
    val product = numbers._1 * numbers._2
    (arg1,numbersArr,product)
  }
  def /(numbers:(Int,Int)):(String,Array[Int],Int) = {
    ("/",Array(numbers._1,numbers._2),numbers._1/numbers._2)
  }
  def -(numbers:(Int,Int)):(String,Array[Int],Int) = {
    ("-",Array(numbers._1,numbers._2),numbers._1-numbers._2)
  }
  def +(numbers:(Int,Int)):(String,Array[Int],Int) = {
    ("+",Array(numbers._1,numbers._2),numbers._1+numbers._2)
  }


}